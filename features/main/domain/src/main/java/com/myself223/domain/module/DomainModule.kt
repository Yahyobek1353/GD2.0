package com.myself223.geeksdelivery.domain.module

import com.myself223.domain.usecase.CategoryUseCase
import org.koin.dsl.module


val useCaseModule = module {
    single { CategoryUseCase(get()) }
}