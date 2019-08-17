/*
 * Created by Onkar Nene on 17/8/19 4:34 PM
 *
 * Copyright (c) 2019 Onkar Nene. All rights reserved.
 */

package com.onkar.android.gojekdemo.interfaces

import com.onkar.android.gojekdemo.models.GitHubRepo
import retrofit2.Call
import retrofit2.http.GET

interface TrendingRepositoryApiCallback {
	
	@GET("repositories")
	fun getRepositories(): Call<ArrayList<GitHubRepo>>
}