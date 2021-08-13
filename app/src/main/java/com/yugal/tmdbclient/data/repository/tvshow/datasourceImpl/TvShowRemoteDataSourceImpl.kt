package com.yugal.tmdbclient.data.repository.tvshow.datasourceImpl

import com.yugal.tmdbclient.data.api.TMDBService
import com.yugal.tmdbclient.data.model.tvshow.TvShowList
import com.yugal.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDatasource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
    ):TvShowRemoteDatasource {
    override suspend fun getTvShows(): Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}