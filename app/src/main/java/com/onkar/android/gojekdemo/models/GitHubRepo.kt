/*
 * Created by Onkar Nene on 17/8/19 3:09 PM
 *
 * Copyright (c) 2019 Onkar Nene. All rights reserved.
 */

package com.onkar.android.gojekdemo.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
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
import com.onkar.android.gojekdemo.utilities.TABLE_GITHUB_REPO
import com.onkar.android.gojekdemo.utilities.URL

@Entity(tableName = TABLE_GITHUB_REPO)
data class GitHubRepo(
		@PrimaryKey(autoGenerate = true) var id: Int = 0,
		
		@ColumnInfo @SerializedName(AUTHOR) var author: String? = null,
		
		@ColumnInfo @SerializedName(NAME) var name: String? = null,
		
		@ColumnInfo @SerializedName(AVATAR) var avatar: String? = null,
		
		@ColumnInfo @SerializedName(URL) var url: String? = null,
		
		@ColumnInfo @SerializedName(DESCRIPTION) var description: String? = null,
		
		@ColumnInfo @SerializedName(LANGUAGE) var language: String? = null,
		
		@ColumnInfo @SerializedName(LANGUAGE_COLOR) var languageColor: String? = null,
		
		@ColumnInfo @SerializedName(STARTS) var stars: Long = 0,
		
		@ColumnInfo @SerializedName(FORKS) var forks: Long = 0,
		
		@ColumnInfo @SerializedName(CURRENT_PERIOD_STARS) var currentPeriodStars: Long = 0,
		
		@Ignore @SerializedName(BUILT_BY) var builtBy: ArrayList<BuiltBy> = arrayListOf()
)