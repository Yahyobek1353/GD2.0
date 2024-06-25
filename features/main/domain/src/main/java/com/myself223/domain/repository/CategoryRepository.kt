package com.myself223.domain.repository

import com.myself223.common.Either
import com.myself223.geeksdelivery.domain.model.CategoryModel
import com.myself223.geeksdelivery.domain.model.MealModel
import kotlinx.coroutines.flow.Flow

interface CategoryRepository {
    fun getAllCategory(): Flow<Either<String, List<CategoryModel>>>
    fun getMealByCategory(categoryName: String): Flow<Either<String, List<MealModel>>>
}