package com.myself223.main.presentation.ui.fragments.menu
import android.util.Log
import com.myself223.core.base.BaseViewModel
import com.myself223.domain.usecase.CategoryUseCase
import com.myself223.geeksdelivery.presentation.model.CategoryUi
import com.myself223.geeksdelivery.presentation.model.MealUi
import com.myself223.geeksdelivery.presentation.model.toUI
import kotlinx.coroutines.flow.asStateFlow

class MenuViewModel(
    private val categoryUseCase: CategoryUseCase
) : BaseViewModel() {
    private val _categoriesState = mutableStateFlow<List<CategoryUi>>()
    val categoriesState = _categoriesState.asStateFlow()
    private val _mealsState = mutableStateFlow<List<MealUi>>()
    val mealsState = _mealsState.asStateFlow()
    fun getAllCategory()=
        categoryUseCase().gatherRequest(_categoriesState){ categoryModel ->
            categoryModel.map { it.toUI() }

        }

    fun getMealsByCategory(categoryName: String) =
        categoryUseCase.getMealsByCategory(categoryName = categoryName).gatherRequest(_mealsState) { mealModel ->
            mealModel.map { it.toUI() }
        }
    init {
        Log.d("MenuViewModel", "ViewModel initialized")
    }

}
