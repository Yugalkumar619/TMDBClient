package com.yugal.tmdbclient.data
import com.google.gson.annotations.SerializedName
import com.yugal.tmdbclient.data.TvShow

data class TvShowList(
    @SerializedName("results")
    val tvShows: List<TvShow>
)