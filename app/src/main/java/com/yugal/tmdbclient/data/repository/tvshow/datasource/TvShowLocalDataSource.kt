package com.yugal.tmdbclient.data.repository.tvshow.datasource

import com.yugal.tmdbclient.data.model.tvshow.TvShow

interface TvShowLocalDataSource {
    suspend fun getTvShowsFromDB():List<TvShow>
    suspend fun saveTvShowsToDB(tvShow: List<TvShow>)
    suspend fun clearAll()
}