package com.myself223.geeksdelivery.data.module

import com.myself223.data.remote.repository.CategoryRepositoryImpl
import com.myself223.domain.repository.CategoryRepository
import org.koin.dsl.module

val repoModule = module {
    single<CategoryRepository>{ CategoryRepositoryImpl(get()) }
}