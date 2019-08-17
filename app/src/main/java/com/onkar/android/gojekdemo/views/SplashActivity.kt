/*
 * Created by Onkar Nene on 17/8/19 2:38 PM
 *
 * Copyright (c) 2019 Onkar Nene. All rights reserved.
 */

package com.onkar.android.gojekdemo.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.onkar.android.gojekdemo.R.layout

class SplashActivity : AppCompatActivity() {
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(layout.activity_splash)
	}
}