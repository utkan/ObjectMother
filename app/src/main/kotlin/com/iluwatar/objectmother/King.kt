package com.iluwatar.objectmother

/**
 * Defines all attributes and behaviour related to the King.
 */
class King : Royalty {
    var isDrunk = false
    var isHappy = false
    override fun makeDrunk() {
        isDrunk = true
    }

    override fun makeSober() {
        isDrunk = false
    }

    override fun makeHappy() {
        isHappy = true
    }

    override fun makeUnhappy() {
        isHappy = false
    }

    /**
     * Method to flirt to a queen.
     *
     * @param queen Queen which should be flirted.
     */
    fun flirt(queen: Queen) {
        val flirtStatus = queen.getFlirted(this)
        if (!flirtStatus) {
            makeUnhappy()
        } else {
            makeHappy()
        }
    }
}