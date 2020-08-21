package br.com.zup.quantidadepessoas

import android.app.Application

class AppApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        BeagleSetup().init(this)
    }
}