/*
 * Created by Onkar Nene on 17/8/19 4:31 PM
 *
 * Copyright (c) 2019 Onkar Nene. All rights reserved.
 */

package com.onkar.android.gojekdemo.routers

import com.onkar.android.gojekdemo.interfaces.HttpEventTracker
import com.onkar.android.gojekdemo.interfaces.HttpOperationCallback
import com.onkar.android.gojekdemo.interfaces.TrendingRepositoryApiCallback
import com.onkar.android.gojekdemo.models.GitHubRepo
import com.onkar.android.gojekdemo.networks.HttpOperationWrapper
import com.onkar.android.gojekdemo.utilities.NetworkUtils
import okhttp3.ResponseBody
import retrofit2.Call

/**
 * Router class for handling Trending repository API network calls.
 */
class TrendingRepositoryRouter(private val eventTracker: HttpEventTracker<ArrayList<GitHubRepo>>) : HttpOperationCallback<ArrayList<GitHubRepo>> {
	
	private lateinit var call: Call<ArrayList<GitHubRepo>>
	
	private val trendingRepositoryApiCallback: TrendingRepositoryApiCallback by lazy {
		NetworkUtils.retrofitBuilder.build().create(TrendingRepositoryApiCallback::class.java)
	}
	
	/**
	 * Initialize the call.
	 */
	fun init() {
		call = trendingRepositoryApiCallback.getRepositories()
		HttpOperationWrapper<ArrayList<GitHubRepo>>().initCall(call, this)
	}
	
	/**
	 * Cancel ongoing retrofit call.
	 */
	fun stop() {
		if (this::call.isInitialized && call.isExecuted && !call.isCanceled) {
			call.cancel()
		}
	}
	
	override fun onResponse(
			call: Call<ArrayList<GitHubRepo>>,
			result: ArrayList<GitHubRepo>?,
			errorPair: Pair<String, Throwable>,
			errorBody: ResponseBody?
	) {
		when {
			result != null -> eventTracker.onCallSuccess(result)
			else -> eventTracker.onCallFail(errorPair.first, errorPair.second, errorBody)
		}
	}
}