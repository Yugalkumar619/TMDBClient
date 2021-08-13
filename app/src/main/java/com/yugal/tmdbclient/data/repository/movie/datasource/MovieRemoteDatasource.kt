package com.yugal.tmdbclient.data.repository.movie.datasource

import com.yugal.tmdbclient.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
    suspend fun getMovies():Response<MovieList>
}