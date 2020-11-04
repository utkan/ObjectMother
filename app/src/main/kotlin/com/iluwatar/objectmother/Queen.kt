package com.iluwatar.objectmother

/**
 * Defines all attributes and behaviour related to the Queen.
 */
class Queen : Royalty {
    private var isDrunk = false
    private var isHappy = false
    var isFlirty = false
        private set

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

    fun setFlirtiness(flirtiness: Boolean) {
        isFlirty = flirtiness
    }

    /**
     * Method which is called when the king is flirting to a queen.
     *
     * @param king King who initialized the flirt.
     * @return A value which describes if the flirt was successful or not.
     */
    fun getFlirted(king: King): Boolean {
        return isFlirty && king.isHappy && !king.isDrunk
    }
}