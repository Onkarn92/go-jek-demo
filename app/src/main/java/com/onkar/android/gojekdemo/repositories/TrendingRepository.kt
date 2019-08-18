/*
 * Created by Onkar Nene on 18/8/19 4:16 PM
 *
 * Copyright (c) 2019 Onkar Nene. All rights reserved.
 */

package com.onkar.android.gojekdemo.repositories

import androidx.lifecycle.MutableLiveData
import com.onkar.android.gojekdemo.R
import com.onkar.android.gojekdemo.interfaces.HttpEventTracker
import com.onkar.android.gojekdemo.models.GitHubRepo
import com.onkar.android.gojekdemo.routers.TrendingRepositoryRouter
import com.onkar.android.gojekdemo.utilities.Utils
import okhttp3.ResponseBody

object TrendingRepository : HttpEventTracker<ArrayList<GitHubRepo>> {
	
	/**
	 * GitHubRepo data observer.
	 */
	private val liveData: MutableLiveData<Triple<String, String, ArrayList<GitHubRepo>>> = MutableLiveData()
	/**
	 * Router class responsible for handling trending repository network calls.
	 */
	private val trendingRepositoryRouter: TrendingRepositoryRouter = TrendingRepositoryRouter(this)
	
	/**
	 * @return GitHubRepo data observer instance.
	 */
	fun getLiveData() = liveData
	
	/**
	 * Initialize network call for fetching trending repositories.
	 */
	fun getRepositories() {
		trendingRepositoryRouter.init()
	}
	
	/**
	 * Cancel the ongoing call.
	 */
	fun stop() {
		trendingRepositoryRouter.stop()
	}
	
	override fun onCallSuccess(response: ArrayList<GitHubRepo>) {
		liveData.value = Triple(Utils.getString(R.string.err_empty_response), Utils.getString(R.string.err_msg_page_not_found), response)
	}
	
	override fun onCallFail(
			cause: String,
			throwable: Throwable,
			responseBody: ResponseBody?
	) {
		liveData.value = Triple(cause, throwable.localizedMessage, arrayListOf())
	}
}