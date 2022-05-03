package com.example.myquotewithretrofit

import com.google.gson.annotations.SerializedName

data class RandomResponse(

	@field:SerializedName("author")
	val author: String? = null,

	@field:SerializedName("en")
	val en: String? = null,

	@field:SerializedName("id")
	val id: String? = null
)
