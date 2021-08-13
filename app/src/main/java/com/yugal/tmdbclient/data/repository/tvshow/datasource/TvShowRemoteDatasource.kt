package com.yugal.tmdbclient.data.repository.tvshow.datasource

import com.yugal.tmdbclient.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {
    suspend fun getTvShows():Response<TvShowList>
}