package com.myotive.celeryman.di

import com.myotive.celeryman.presenters.CeleryInterface
import com.myotive.celeryman.presenters.CeleryPresenter
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.module

object CeleryModule{
    fun get() = module {
        factory { CeleryPresenter(androidContext()) as CeleryInterface }
    }
}