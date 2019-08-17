/*
 * Created by Onkar Nene on 17/8/19 3:20 PM
 *
 * Copyright (c) 2019 Onkar Nene. All rights reserved.
 */

package com.onkar.android.gojekdemo.utilities

import android.content.Context
import android.net.ConnectivityManager
import com.onkar.android.gojekdemo.App
import com.onkar.android.gojekdemo.R
import com.onkar.android.gojekdemo.utilities.Utils.getString
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.HttpURLConnection
import java.util.concurrent.TimeUnit.*

object NetworkUtils {
	
	const val CODE_NO_INTERNET: Int = -1
	private const val BASE_URL = "https://github-trending-api.now.sh/"
	private const val CODE_UNKNOWN: Int = 0
	
	private val BAD_REQUEST = getString(R.string.err_bad_request) to Throwable(getString(R.string.err_msg_bad_request))
	private val UNAUTHORIZED = getString(R.string.err_unauthorized) to Throwable(getString(R.string.err_msg_unauthorized))
	private val PAGE_NOT_FOUND = getString(R.string.err_page_not_found) to Throwable(getString(R.string.err_msg_page_not_found))
	private val TIMEOUT = getString(R.string.err_timeout) to Throwable(getString(R.string.err_msg_timeout))
	private val MAINTENANCE_BREAK = getString(R.string.err_maintenance_break) to Throwable(getString(R.string.err_msg_maintenance_break))
	
	/**
	 * Creates single instance of retrofit.
	 *
	 * @return retrofit instance.
	 */
	val retrofitBuilder: Retrofit.Builder by lazy {
		val client = OkHttpClient().newBuilder().connectTimeout(30, SECONDS).readTimeout(30, SECONDS).build()
		Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).client(client)
	}
	
	/**
	 * Check for response validity with following conditions:
	 * NotNull, Non-empty body, [Response.isSuccessful]
	 *
	 * @param response object to be examined.
	 *
	 * @return true if response is valid, otherwise false.
	 */
	fun isValidResponse(response: Response<*>): Boolean = response.isSuccessful && response.body() != null
	
	fun getRequestFailReason(
			code: Int = CODE_UNKNOWN,
			throwable: Throwable? = null
	) = when (code) {
		CODE_NO_INTERNET -> getString(R.string.err_request_fail) to Throwable(getString(R.string.err_no_internet))
		HttpURLConnection.HTTP_BAD_REQUEST, HttpURLConnection.HTTP_BAD_METHOD, HttpURLConnection.HTTP_UNSUPPORTED_TYPE -> BAD_REQUEST
		HttpURLConnection.HTTP_UNAUTHORIZED -> UNAUTHORIZED
		HttpURLConnection.HTTP_NOT_FOUND, HttpURLConnection.HTTP_NOT_ACCEPTABLE -> PAGE_NOT_FOUND
		HttpURLConnection.HTTP_CLIENT_TIMEOUT, HttpURLConnection.HTTP_GATEWAY_TIMEOUT -> TIMEOUT
		HttpURLConnection.HTTP_INTERNAL_ERROR, HttpURLConnection.HTTP_BAD_GATEWAY, HttpURLConnection.HTTP_UNAVAILABLE -> MAINTENANCE_BREAK
		else -> getString(R.string.err_something_went_wrong) to (throwable ?: Throwable(getString(R.string.err_msg_something_went_wrong)))
	}
	
	/**
	 * Check for internet connection availability.
	 *
	 * @return true if device is currently connected to the internet (WiFi or Mobile Data), otherwise false.
	 */
	@Suppress("DEPRECATION")
	fun isNetworkAvailable(): Boolean {
		val networkInfo = (App.getContext().getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?)?.activeNetworkInfo
		return networkInfo != null && networkInfo.isConnected
	}
}