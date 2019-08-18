/*
 * Created by Onkar Nene on 18/8/19 4:03 PM
 *
 * Copyright (c) 2019 Onkar Nene. All rights reserved.
 */

package com.onkar.android.gojekdemo.views.models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.onkar.android.gojekdemo.models.GitHubRepo
import com.onkar.android.gojekdemo.repositories.TrendingRepository

class TrendingViewModel : ViewModel() {
	
	/**
	 * GitHubRepo data observer.GitHubRepo data observer instance created by [TrendingRepository].
	 */
	private val liveData: MutableLiveData<Triple<String, String, ArrayList<GitHubRepo>>> = TrendingRepository.getLiveData()
	
	/**
	 * Get all GitHub's trending repositories.
	 */
	fun getRepositories() {
		TrendingRepository.getRepositories()
	}
	
	/**
	 * Cancel any ongoing network calls.
	 */
	fun stopLoadingRepositories() {
		TrendingRepository.stop()
	}
	
	/**
	 * @return [MutableLiveData] instance which will observe repositories.
	 */
	fun getObserver() = liveData
}