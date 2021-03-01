package com.ekwing.apptemplate

import android.app.Application
import android.content.Context
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.ekwing.apptemplate.config.GlideApp

/**
 *
 * created by reol at 3/1/21
 */
class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        application = this
    }

    companion object{
        @JvmStatic
        private lateinit var application: Application

        @JvmStatic
        fun getContext(): Context?{
            return application?.applicationContext
        }

        @JvmStatic
        fun requireAppContext(): Context{
            return application.applicationContext
        }
    }
}