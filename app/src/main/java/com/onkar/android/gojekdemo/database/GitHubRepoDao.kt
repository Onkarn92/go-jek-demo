/*
 * Created by Onkar Nene on 19/8/19 8:30 PM
 *
 * Copyright (c) 2019 Onkar Nene. All rights reserved.
 */

package com.onkar.android.gojekdemo.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.onkar.android.gojekdemo.models.GitHubRepo
import com.onkar.android.gojekdemo.utilities.TABLE_GITHUB_REPO

@Dao
interface GitHubRepoDao {
	
	@Query("SELECT * FROM $TABLE_GITHUB_REPO")
	fun getAllRepositories(): LiveData<List<GitHubRepo>>
	
	@Insert
	fun insertAllRepositories(repos: List<GitHubRepo>)
	
	@Query("DELETE FROM $TABLE_GITHUB_REPO")
	fun deleteAllRepositories()
}