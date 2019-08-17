/*
 * Created by Onkar Nene on 17/8/19 3:09 PM
 *
 * Copyright (c) 2019 Onkar Nene. All rights reserved.
 */

package com.onkar.android.gojekdemo.models

import com.google.gson.annotations.SerializedName
import com.onkar.android.gojekdemo.utilities.AVATAR
import com.onkar.android.gojekdemo.utilities.EMPTY_STRING
import com.onkar.android.gojekdemo.utilities.HREF
import com.onkar.android.gojekdemo.utilities.USERNAME

data class BuiltBy(
		@SerializedName(USERNAME) var username: String? = EMPTY_STRING,
		
		@SerializedName(HREF) var href: String? = EMPTY_STRING,
		
		@SerializedName(AVATAR) var avatar: String? = EMPTY_STRING
)