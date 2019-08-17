/*
 * Created by Onkar Nene on 17/8/19 3:49 PM
 *
 * Copyright (c) 2019 Onkar Nene. All rights reserved.
 */

package com.onkar.android.gojekdemo.interfaces

import okhttp3.ResponseBody
import retrofit2.Call

interface HttpOperationCallback<T> {
	
	/**
	 * Callback function for any type of response.
	 *
	 * @param call      instance of executed [Call].
	 * @param result    contains response body.
	 * @param errorPair contains human readable exception.
	 * @param errorBody contains error body.
	 */
	fun onResponse(
			call: Call<T>,
			result: T? = null,
			errorPair: Pair<String, Throwable>,
			errorBody: ResponseBody? = null
	)
}