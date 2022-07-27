package com.bchmsl.task4.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.children
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import com.bchmsl.task4.model.Button
import com.bchmsl.task4.adapters.TicTacToeAdapter
import com.bchmsl.task4.checkers.WinnerFor3
import com.bchmsl.task4.checkers.WinnerFor4
import com.bchmsl.task4.checkers.WinnerFor5
import com.bchmsl.task4.databinding.FragmentTicTacToeBinding


class TicTacToeFragment : Fragment() {
    private var _binding: FragmentTicTacToeBinding? = null
    private val binding get() = _binding!!
    private val args: TicTacToeFragmentArgs by navArgs()
    private lateinit var ticTacToeAdapter: TicTacToeAdapter
    private var buttonsList = mutableListOf<Button>()
    private var isCross = true

    private val winnerChecker3 by lazy { WinnerFor3() }
    private val winnerChecker4 by lazy { WinnerFor4() }
    private val winnerChecker5 by lazy { WinnerFor5() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTicTacToeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        setupRecycler()
        listeners()
    }

    private fun setupRecycler() {
        repeat(args.spanCount * args.spanCount) {
            buttonsList.add(Button())
        }
        ticTacToeAdapter = TicTacToeAdapter(buttonsList)
        binding.rvTicTacToe.apply {
            adapter = ticTacToeAdapter
            layoutManager = GridLayoutManager(requireContext(), args.spanCount)
        }
    }

    private fun listeners() {
        ticTacToeAdapter.boxClicked = { button, imageButton ->
            button.isCross = isCross
            ticTacToeAdapter.notifyDataSetChanged()
            when (args.spanCount) {
                3 -> checkWinnerFor3()
                4 -> checkWinnerFor4()
                5 -> checkWinnerFor5()
            }
        }
    }


    private fun checkWinnerFor3() {
        winnerChecker3.submitList(buttonsList)
        if (winnerChecker3.checkWinner()) {
            getWinner()
        } else {
            isCross = !isCross
        }
    }


    private fun checkWinnerFor4() {
        winnerChecker4.submitList(buttonsList)
        if (winnerChecker4.checkWinner()) {
            getWinner()
        } else {
            isCross = !isCross
        }
    }

    private fun checkWinnerFor5() {
        winnerChecker5.submitList(buttonsList)
        if (winnerChecker5.checkWinner()) {
            getWinner()
        } else {
            isCross = !isCross
        }
    }

    private fun getWinner() {
        binding.rvTicTacToe.children.forEach {
            it.isEnabled = false
        }
        val winner = if (isCross) "X" else "O"
        Toast.makeText(requireContext(), "WINNER IS $winner", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}