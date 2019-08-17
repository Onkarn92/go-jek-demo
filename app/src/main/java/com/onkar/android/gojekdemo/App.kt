/*
 * Created by Onkar Nene on 17/8/19 2:23 PM
 *
 * Copyright (c) 2019 Onkar Nene. All rights reserved.
 */

package com.onkar.android.gojekdemo

import android.content.Context
import androidx.appcompat.app.AppCompatDelegate
import androidx.multidex.MultiDexApplication

class App : MultiDexApplication() {
	
	companion object {
		private lateinit var app: App
		
		/**
		 * @return current context of this application
		 */
		@JvmStatic
		fun getContext(): Context = app.applicationContext
	}
	
	override fun onCreate() {
		super.onCreate()
		app = this
		AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
	}
}