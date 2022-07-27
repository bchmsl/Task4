package com.bchmsl.task4.checkers

class WinnerFor3 : WinnerChecker() {

    override fun checkHorizontal(): Boolean {

        with(list) {
            if (this[0].isCross != null
                && this[0].isCross == this[1].isCross
                && this[0].isCross == this[2].isCross
            ) return true

            if (this[3].isCross != null
                && this[3].isCross == this[4].isCross
                && this[3].isCross == this[5].isCross
            ) return true

            if (this[6].isCross != null
                && this[6].isCross == this[7].isCross
                && this[6].isCross == this[8].isCross
            ) return true
        }
        return false
    }

    override fun checkVertical(): Boolean {
        with(list) {
            if (this[0].isCross != null
                && this[0].isCross == this[3].isCross
                && this[0].isCross == this[6].isCross
            ) return true

            if (this[1].isCross != null
                && this[1].isCross == this[4].isCross
                && this[1].isCross == this[7].isCross
            ) return true

            if (this[2].isCross != null
                && this[2].isCross == this[5].isCross
                && this[2].isCross == this[8].isCross
            ) return true
        }
        return false
    }

    override fun checkDiagonal(): Boolean {
        with(list) {
            if (this[0].isCross != null
                && this[0].isCross == this[4].isCross
                && this[0].isCross == this[8].isCross
            ) return true

            if (this[2].isCross != null
                && this[2].isCross == this[4].isCross
                && this[2].isCross == this[6].isCross
            ) return true
        }
        return false
    }
}
