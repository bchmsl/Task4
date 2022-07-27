package com.bchmsl.task4.checkers

import com.bchmsl.task4.model.Button

abstract class WinnerChecker {
    var list = listOf<Button>()

    fun checkWinner(): Boolean {
        return checkHorizontal() || checkVertical() || checkDiagonal()
    }

    abstract fun checkHorizontal(): Boolean
    abstract fun checkVertical(): Boolean
    abstract fun checkDiagonal(): Boolean

    fun submitList(newList: List<Button>){
        list = newList
    }
}