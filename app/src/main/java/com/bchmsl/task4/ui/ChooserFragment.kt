package com.bchmsl.task4.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bchmsl.task4.databinding.FragmentChooserBinding

class ChooserFragment : Fragment() {
    private var _binding : FragmentChooserBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChooserBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        listeners()
    }

    private fun listeners() {
        binding.btnStart3.setOnClickListener {
            findNavController().navigate(ChooserFragmentDirections.actionChooserFragmentToTicTacToeFragment(3))
        }
        binding.btnStart4.setOnClickListener {
            findNavController().navigate(ChooserFragmentDirections.actionChooserFragmentToTicTacToeFragment(4))
        }
        binding.btnStart5.setOnClickListener {
            findNavController().navigate(ChooserFragmentDirections.actionChooserFragmentToTicTacToeFragment(5))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}