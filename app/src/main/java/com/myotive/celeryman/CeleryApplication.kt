package com.myotive.celeryman

import android.app.Application
import com.myotive.celeryman.di.CeleryModule
import org.koin.android.ext.android.startKoin

class CeleryApplication(): Application(){
    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(CeleryModule.get()))
    }
}