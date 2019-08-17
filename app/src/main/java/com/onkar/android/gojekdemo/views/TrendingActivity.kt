/*
 * Created by Onkar Nene on 17/8/19 2:39 PM
 *
 * Copyright (c) 2019 Onkar Nene. All rights reserved.
 */

package com.onkar.android.gojekdemo.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.onkar.android.gojekdemo.R
import kotlinx.android.synthetic.main.activity_trending.*

class TrendingActivity : AppCompatActivity() {
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_trending)
		setSupportActionBar(toolbar)
		
		fab.setOnClickListener {view ->
			Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show()
		}
	}
}
