package com.yugal.tmdbclient.domain.repository

import com.yugal.tmdbclient.data.model.tvshow.TvShow

interface TvShowRepository {
    suspend fun getTvShows():List<TvShow>?
    suspend fun updateTvShows():List<TvShow>?
}