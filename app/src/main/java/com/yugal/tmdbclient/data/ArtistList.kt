package com.yugal.tmdbclient.data
import com.google.gson.annotations.SerializedName
import com.yugal.tmdbclient.data.Artist

data class ArtistList(
    @SerializedName("results")
    val artists: List<Artist>
)