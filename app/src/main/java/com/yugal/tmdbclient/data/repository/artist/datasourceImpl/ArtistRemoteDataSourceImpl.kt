package com.yugal.tmdbclient.data.repository.artist.datasourceImpl

import com.yugal.tmdbclient.data.api.TMDBService
import com.yugal.tmdbclient.data.model.movie.MovieList
import com.yugal.tmdbclient.data.repository.movie.datasource.MovieRemoteDatasource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
) :MovieRemoteDatasource{
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)
}