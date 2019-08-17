/*
 * Created by Onkar Nene on 17/8/19 3:48 PM
 *
 * Copyright (c) 2019 Onkar Nene. All rights reserved.
 */

package com.onkar.android.gojekdemo.utilities

import android.content.Context
import com.bumptech.glide.GlideBuilder
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.module.AppGlideModule
import com.bumptech.glide.request.RequestOptions

@GlideModule
class GlideConfig : AppGlideModule() {
	
	override fun applyOptions(
			context: Context,
			builder: GlideBuilder
	) {
		super.applyOptions(context, builder)
		builder.setDefaultRequestOptions(RequestOptions().format(DecodeFormat.PREFER_ARGB_8888))
	}
}