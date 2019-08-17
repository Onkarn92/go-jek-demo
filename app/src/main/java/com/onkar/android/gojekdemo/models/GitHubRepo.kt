/*
 * Created by Onkar Nene on 17/8/19 3:09 PM
 *
 * Copyright (c) 2019 Onkar Nene. All rights reserved.
 */

package com.onkar.android.gojekdemo.models

import com.google.gson.annotations.SerializedName
import com.onkar.android.gojekdemo.utilities.AUTHOR
import com.onkar.android.gojekdemo.utilities.AVATAR
import com.onkar.android.gojekdemo.utilities.BUILT_BY
import com.onkar.android.gojekdemo.utilities.CURRENT_PERIOD_STARS
import com.onkar.android.gojekdemo.utilities.DESCRIPTION
import com.onkar.android.gojekdemo.utilities.FORKS
import com.onkar.android.gojekdemo.utilities.LANGUAGE
import com.onkar.android.gojekdemo.utilities.LANGUAGE_COLOR
import com.onkar.android.gojekdemo.utilities.NAME
import com.onkar.android.gojekdemo.utilities.STARTS
import com.onkar.android.gojekdemo.utilities.URL

data class GitHubRepo(
		@SerializedName(AUTHOR) var author: String? = null,
		
		@SerializedName(NAME) var name: String? = null,
		
		@SerializedName(AVATAR) var avatar: String? = null,
		
		@SerializedName(URL) var url: String? = null,
		
		@SerializedName(DESCRIPTION) var description: String? = null,
		
		@SerializedName(LANGUAGE) var language: String? = null,
		
		@SerializedName(LANGUAGE_COLOR) var languageColor: String? = null,
		
		@SerializedName(STARTS) var stars: Long = 0,
		
		@SerializedName(FORKS) var forks: Long = 0,
		
		@SerializedName(CURRENT_PERIOD_STARS) var currentPeriodStars: Long = 0,
		
		@SerializedName(BUILT_BY) var builtBy: ArrayList<BuiltBy> = arrayListOf()
)