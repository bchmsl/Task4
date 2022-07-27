package com.bchmsl.task4.checkers

class WinnerFor5 : WinnerChecker() {
    override fun checkHorizontal(): Boolean {
        with(list) {
            if (this[0].isCross != null
                && this[0].isCross == this[1].isCross
                && this[0].isCross == this[2].isCross
                && this[0].isCross == this[3].isCross
                && this[0].isCross == this[4].isCross
            ) return true

            if (this[5].isCross != null
                && this[5].isCross == this[6].isCross
                && this[5].isCross == this[7].isCross
                && this[5].isCross == this[8].isCross
                && this[5].isCross == this[9].isCross
            ) return true

            if (this[10].isCross != null
                && this[10].isCross == this[11].isCross
                && this[10].isCross == this[12].isCross
                && this[10].isCross == this[13].isCross
                && this[10].isCross == this[14].isCross
            ) return true

            if (this[15].isCross != null
                && this[15].isCross == this[16].isCross
                && this[15].isCross == this[17].isCross
                && this[15].isCross == this[18].isCross
                && this[15].isCross == this[19].isCross
            ) return true

            if (this[20].isCross != null
                && this[20].isCross == this[21].isCross
                && this[20].isCross == this[22].isCross
                && this[20].isCross == this[23].isCross
                && this[20].isCross == this[24].isCross
            ) return true
        }
        return false

    }

    override fun checkVertical(): Boolean {
        with(list) {
            if (this[0].isCross != null
                && this[0].isCross == this[5].isCross
                && this[0].isCross == this[10].isCross
                && this[0].isCross == this[15].isCross
                && this[0].isCross == this[20].isCross
            ) return true

            if (this[1].isCross != null
                && this[1].isCross == this[6].isCross
                && this[1].isCross == this[11].isCross
                && this[1].isCross == this[16].isCross
                && this[1].isCross == this[21].isCross
            ) return true

            if (this[2].isCross != null
                && this[2].isCross == this[7].isCross
                && this[2].isCross == this[12].isCross
                && this[2].isCross == this[17].isCross
                && this[2].isCross == this[22].isCross
            ) return true

            if (this[3].isCross != null
                && this[3].isCross == this[8].isCross
                && this[3].isCross == this[13].isCross
                && this[3].isCross == this[18].isCross
                && this[3].isCross == this[23].isCross
            ) return true

            if (this[4].isCross != null
                && this[4].isCross == this[9].isCross
                && this[4].isCross == this[14].isCross
                && this[4].isCross == this[19].isCross
                && this[4].isCross == this[24].isCross
            ) return true
        }
        return false
    }

    override fun checkDiagonal(): Boolean {
        with(list) {
            if (this[0].isCross != null
                && this[0].isCross == this[6].isCross
                && this[0].isCross == this[12].isCross
                && this[0].isCross == this[18].isCross
                && this[0].isCross == this[24].isCross
            ) return true

            if (this[4].isCross != null
                && this[4].isCross == this[8].isCross
                && this[4].isCross == this[12].isCross
                && this[4].isCross == this[16].isCross
                && this[4].isCross == this[20].isCross
            ) return true
        }
        return false
    }
}