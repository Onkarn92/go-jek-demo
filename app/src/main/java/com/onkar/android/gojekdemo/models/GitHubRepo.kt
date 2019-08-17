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
import com.onkar.android.gojekdemo.utilities.EMPTY_STRING
import com.onkar.android.gojekdemo.utilities.FORKS
import com.onkar.android.gojekdemo.utilities.LANGUAGE
import com.onkar.android.gojekdemo.utilities.LANGUAGE_COLOR
import com.onkar.android.gojekdemo.utilities.NAME
import com.onkar.android.gojekdemo.utilities.STARTS
import com.onkar.android.gojekdemo.utilities.URL

data class GitHubRepo(
		@SerializedName(AUTHOR) var author: String? = EMPTY_STRING,
		
		@SerializedName(NAME) var name: String? = EMPTY_STRING,
		
		@SerializedName(AVATAR) var avatar: String? = EMPTY_STRING,
		
		@SerializedName(URL) var url: String? = EMPTY_STRING,
		
		@SerializedName(DESCRIPTION) var description: String? = EMPTY_STRING,
		
		@SerializedName(LANGUAGE) var language: String? = EMPTY_STRING,
		
		@SerializedName(LANGUAGE_COLOR) var languageColor: String? = EMPTY_STRING,
		
		@SerializedName(STARTS) var stars: Int = 0,
		
		@SerializedName(FORKS) var forks: Int = 0,
		
		@SerializedName(CURRENT_PERIOD_STARS) var currentPeriodStars: Int = 0,
		
		@SerializedName(BUILT_BY) var builtBy: ArrayList<BuiltBy> = arrayListOf()
)