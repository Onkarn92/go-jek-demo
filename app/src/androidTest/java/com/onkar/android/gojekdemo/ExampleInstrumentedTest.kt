/*
 * Created by Onkar Nene on 17/8/19 2:09 PM
 *
 * Copyright (c) 2019 Onkar Nene. All rights reserved.
 */

package com.onkar.android.gojekdemo

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.*
import org.junit.Assert.*
import org.junit.runner.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
	
	@Test
	fun useAppContext() {
		// Context of the app under test.
		val appContext = InstrumentationRegistry.getInstrumentation().targetContext
		assertEquals("com.onkar.android.gojekdemo", appContext.packageName)
	}
}
