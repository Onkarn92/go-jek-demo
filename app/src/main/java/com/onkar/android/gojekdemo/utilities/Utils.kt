/*
 * Created by Onkar Nene on 17/8/19 3:29 PM
 *
 * Copyright (c) 2019 Onkar Nene. All rights reserved.
 */

package com.onkar.android.gojekdemo.utilities

import androidx.annotation.StringRes
import com.onkar.android.gojekdemo.App

object Utils {
	
	fun getString(@StringRes resId: Int): String = App.getContext().getString(resId)
	
	fun getFormattedString(@StringRes resId: Int, vararg args: Any): String = App.getContext().getString(resId, args)
}