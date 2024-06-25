package com.myself223.geeksdelivery.presentation.model

import com.myself223.geeksdelivery.domain.model.CategoryModel
import com.myself223.geeksdelivery.domain.model.MealModel

data class MealUi(
    val nameMeal: String? = null,
    val imgMeal:String? = null
)

fun MealModel.toUI() = MealUi(
    nameMeal = nameMeal,
    imgMeal = imgMeal
)
