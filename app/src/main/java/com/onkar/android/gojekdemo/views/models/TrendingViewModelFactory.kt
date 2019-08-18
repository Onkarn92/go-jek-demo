/*
 * Created by Onkar Nene on 18/8/19 4:04 PM
 *
 * Copyright (c) 2019 Onkar Nene. All rights reserved.
 */

package com.onkar.android.gojekdemo.views.models

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * [TrendingViewModel] instance creator.
 */
class TrendingViewModelFactory : ViewModelProvider.Factory {
	
	@Suppress("UNCHECKED_CAST")
	override fun <T : ViewModel?> create(modelClass: Class<T>): T {
		if (modelClass.isAssignableFrom(TrendingViewModel::class.java)) {
			return (TrendingViewModel() as T)
		} else {
			throw IllegalArgumentException("Unknown ViewModel class")
		}
	}
}