package com.example.composition.domain.entity

data class GameSettings(
    val maxSumValue: Int,
    val minCountOfRightAnswers : Int,
    val minPercentOfRightAnswers: Int,
    val gameTimeInSeconds: Int
)