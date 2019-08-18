/*
 * Created by Onkar Nene on 18/8/19 4:27 PM
 *
 * Copyright (c) 2019 Onkar Nene. All rights reserved.
 */

package com.onkar.android.gojekdemo.modules

import com.onkar.android.gojekdemo.adapters.TrendingRepositoryAdapter
import com.onkar.android.gojekdemo.views.models.TrendingViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TrendingModule {
	
	/**
	 * Provide [TrendingRepositoryAdapter] instance.
	 */
	@Provides
	fun provideTrendingRepositoryAdapter(): TrendingRepositoryAdapter = TrendingRepositoryAdapter()
	
	/**
	 * Provide [TrendingViewModelFactory] instance.
	 */
	@Provides
	fun provideTrendingViewModelFactory(): TrendingViewModelFactory = TrendingViewModelFactory()
}