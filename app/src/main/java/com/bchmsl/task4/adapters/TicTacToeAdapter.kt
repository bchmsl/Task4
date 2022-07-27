package com.bchmsl.task4.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageButton
import androidx.recyclerview.widget.RecyclerView
import com.bchmsl.task4.R
import com.bchmsl.task4.databinding.LayoutButtonBinding
import com.bchmsl.task4.model.Button

class TicTacToeAdapter(val itemsList: MutableList<Button>) : RecyclerView.Adapter<TicTacToeAdapter.TicTacToeViewHolder>() {
    var boxClicked : ((Button, AppCompatImageButton) -> Unit)? = null
    inner class TicTacToeViewHolder(private val binding: LayoutButtonBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val currentItem = itemsList[adapterPosition]
            when (currentItem.isCross) {
                true -> binding.btnButton.setImageResource(R.drawable.ic_x)
                false -> binding.btnButton.setImageResource(R.drawable.ic_o)
                else -> {  }
            }
            binding.btnButton.setOnClickListener {
                it.isActivated = false
                boxClicked?.invoke(currentItem, binding.btnButton)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        TicTacToeViewHolder(LayoutButtonBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: TicTacToeViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = itemsList.size

}