/*
 * Created by Onkar Nene on 19/8/19 8:37 PM
 *
 * Copyright (c) 2019 Onkar Nene. All rights reserved.
 */

package com.onkar.android.gojekdemo.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.onkar.android.gojekdemo.models.GitHubRepo

@Database(entities = [GitHubRepo::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
	
	abstract fun gitHubRepoDao(): GitHubRepoDao
}