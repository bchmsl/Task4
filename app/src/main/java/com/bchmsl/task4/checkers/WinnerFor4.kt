package com.bchmsl.task4.checkers

import com.bchmsl.task4.model.Button

class WinnerFor4(): WinnerChecker() {

    override fun checkHorizontal(): Boolean {
        with(list) {
            if (this[0].isCross != null
                && this[0].isCross == this[1].isCross
                && this[0].isCross == this[2].isCross
                && this[0].isCross == this[3].isCross
            ) return true

            if (this[4].isCross != null
                && this[4].isCross == this[5].isCross
                && this[4].isCross == this[6].isCross
                && this[4].isCross == this[7].isCross
            ) return true

            if (this[8].isCross != null
                && this[8].isCross == this[9].isCross
                && this[8].isCross == this[10].isCross
                && this[8].isCross == this[11].isCross
            ) return true

            if (this[12].isCross != null
                && this[12].isCross == this[13].isCross
                && this[12].isCross == this[14].isCross
                && this[12].isCross == this[15].isCross
            ) return true
        }
        return false
    }

    override fun checkVertical(): Boolean {
        with(list) {
            if (this[0].isCross != null
                && this[0].isCross == this[4].isCross
                && this[0].isCross == this[8].isCross
                && this[0].isCross == this[12].isCross
            ) return true

            if (this[1].isCross != null
                && this[1].isCross == this[5].isCross
                && this[1].isCross == this[9].isCross
                && this[1].isCross == this[13].isCross
            ) return true

            if (this[2].isCross != null
                && this[2].isCross == this[6].isCross
                && this[2].isCross == this[10].isCross
                && this[2].isCross == this[14].isCross
            ) return true

            if (this[3].isCross != null
                && this[3].isCross == this[7].isCross
                && this[3].isCross == this[11].isCross
                && this[3].isCross == this[15].isCross
            ) return true
        }
        return false
    }

    override fun checkDiagonal(): Boolean {
        with(list) {
            if (this[0].isCross != null
                && this[0].isCross == this[5].isCross
                && this[0].isCross == this[10].isCross
                && this[0].isCross == this[15].isCross
            ) return true

            if (this[3].isCross != null
                && this[3].isCross == this[6].isCross
                && this[3].isCross == this[9].isCross
                && this[3].isCross == this[12].isCross
            ) return true
        }
        return false
    }

}