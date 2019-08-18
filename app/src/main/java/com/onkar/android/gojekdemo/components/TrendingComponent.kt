/*
 * Created by Onkar Nene on 18/8/19 4:30 PM
 *
 * Copyright (c) 2019 Onkar Nene. All rights reserved.
 */

package com.onkar.android.gojekdemo.components

import com.onkar.android.gojekdemo.adapters.TrendingRepositoryAdapter
import com.onkar.android.gojekdemo.modules.TrendingModule
import com.onkar.android.gojekdemo.views.TrendingActivity
import com.onkar.android.gojekdemo.views.models.TrendingViewModelFactory
import dagger.Component

/**
 * Dagger component class to provide required dependencies.
 */
@Component(modules = [TrendingModule::class])
interface TrendingComponent {
	
	/**
	 * Provide [TrendingRepositoryAdapter] instance.
	 */
	fun getTrendingRepositoryAdapter(): TrendingRepositoryAdapter
	
	/**
	 * Provide [TrendingViewModelFactory] instance.
	 */
	fun getTrendingViewModelFactory(): TrendingViewModelFactory
	
	/**
	 * Inject [TrendingActivity] instance into dagger implementation.
	 */
	fun injectTrendingActivity(trendingActivity: TrendingActivity)
}