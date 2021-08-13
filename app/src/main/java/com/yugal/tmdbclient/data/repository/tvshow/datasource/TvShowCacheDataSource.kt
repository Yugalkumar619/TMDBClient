package com.yugal.tmdbclient.data.repository.tvshow.datasource

import com.yugal.tmdbclient.data.model.tvshow.TvShow

interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache():List<TvShow>
    suspend fun saveTvShowsToCache(tvShow: List<TvShow>)
}