package com.myself223.geeksdelivery.presentation.model

import com.myself223.geeksdelivery.domain.model.CategoryModel

data class CategoryUi(
    val id: String? = null,
    val name: String? = null,
    val imgP: String? = null,
    val categoryDesc: String? = null
)

fun CategoryModel.toUI() = CategoryUi(
    id = id,
    name = name,
    imgP = imgD,
    categoryDesc = categoryDesc
)
