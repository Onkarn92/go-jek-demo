/*
 * Created by Onkar Nene on 17/8/19 7:24 PM
 *
 * Copyright (c) 2019 Onkar Nene. All rights reserved.
 */

package com.onkar.android.gojekdemo.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.onkar.android.gojekdemo.R
import com.onkar.android.gojekdemo.adapters.TrendingRepositoryAdapter.ViewHolder
import com.onkar.android.gojekdemo.models.GitHubRepo
import com.onkar.android.gojekdemo.utilities.NA
import kotlinx.android.synthetic.main.item_trending_repositories_list.view.*

class TrendingRepositoryAdapter : RecyclerView.Adapter<ViewHolder>() {
	
	private var items: ArrayList<GitHubRepo>? = null
	
	override fun onCreateViewHolder(
			parent: ViewGroup,
			viewType: Int
	): ViewHolder = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_trending_repositories_list, parent, false))
	
	override fun getItemCount(): Int = items?.size ?: 0
	
	override fun onBindViewHolder(
			holder: ViewHolder,
			position: Int
	) {
		val repo = items?.get(position)
		if (repo != null) {
			holder.setData(repo)
		}
	}
	
	fun setItems(repos: ArrayList<GitHubRepo>) {
		items = repos
		notifyDataSetChanged()
	}
	
	class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
		
		fun setData(gitHubRepo: GitHubRepo) {
			Glide.with(itemView.context).load(gitHubRepo.avatar).circleCrop().placeholder(R.drawable.ic_user_placeholder)
					.error(R.drawable.ic_user_placeholder).into(this.itemView.authorProfileImage)
			this.itemView.authorNameText.text = gitHubRepo.author ?: NA
			this.itemView.repositoryNameText.text = gitHubRepo.name ?: NA
			this.itemView.descriptionText.text = gitHubRepo.description ?: NA
			this.itemView.languageText.text = gitHubRepo.language ?: NA
			this.itemView.totalStarText.text = gitHubRepo.stars.toString()
			this.itemView.totalForkText.text = gitHubRepo.forks.toString()
		}
	}
}