package com.applover.dynamicmotionlayoutbar.utils

import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

fun ConstraintLayout.createConstraintSet(block: ConstraintSet.() -> Unit = {}): ConstraintSet {
    val set = ConstraintSet()
    set.clone(this)
    block(set)
    return set
}

fun ConstraintSet.centerInParent(viewId: Int){
    connect(viewId, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END)
    connect(viewId, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START)
    connect(viewId, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP)
    connect(viewId, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM)
}

fun MotionLayout.isStartState() = currentState == startState

fun MotionLayout.isEndState() = currentState == endState
