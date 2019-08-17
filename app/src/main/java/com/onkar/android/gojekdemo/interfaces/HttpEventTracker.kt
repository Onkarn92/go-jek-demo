/*
 * Created by Onkar Nene on 17/8/19 3:49 PM
 *
 * Copyright (c) 2019 Onkar Nene. All rights reserved.
 */

package com.onkar.android.gojekdemo.interfaces

import okhttp3.ResponseBody

interface HttpEventTracker<T> {
	
	/**
	 * Callback function.
	 * Call when current HTTP request executes successfully.
	 *
	 * @param response contains respective response model.
	 */
	fun onCallSuccess(response: T)
	
	/**
	 * Callback function.
	 * Call when current HTTP request fails or response code is not 200 (HTTP OK).
	 *
	 * @param cause        of the request failure.
	 * @param throwable    contains cause of the failure.
	 * @param responseBody contains error body of response.
	 */
	fun onCallFail(
			cause: String,
			throwable: Throwable,
			responseBody: ResponseBody? = null
	)
}