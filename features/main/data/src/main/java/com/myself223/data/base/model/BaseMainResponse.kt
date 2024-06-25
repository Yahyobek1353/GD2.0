package com.myself223.data.base.model

import com.myself223.geeksdelivery.data.remote.dto.CategoryDto
import com.myself223.data.remote.dto.MealDto

class BaseMainResponse(
    val categories: List<CategoryDto>,
    val meals:List<MealDto>
)
