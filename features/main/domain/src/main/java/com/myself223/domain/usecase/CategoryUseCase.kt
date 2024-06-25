package com.myself223.domain.usecase

import com.myself223.common.Either
import com.myself223.geeksdelivery.domain.model.MealModel
import com.myself223.domain.repository.CategoryRepository
import kotlinx.coroutines.flow.Flow

class CategoryUseCase(private val repository: CategoryRepository) {
    operator fun invoke() = repository.getAllCategory()
    operator fun invoke(categoryName: String) = repository.getMealByCategory(categoryName = categoryName)

    fun getMealsByCategory(categoryName: String): Flow<Either<String, List<MealModel>>> = repository.getMealByCategory(categoryName)

}