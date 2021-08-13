package com.yugal.tmdbclient.data.repository.movie.datasource

import com.yugal.tmdbclient.data.model.movie.Movie

interface MovieLocalDataSource {
    suspend fun getMoviesFromDB():List<Movie>
    suspend fun saveMoviesToDB(movie: List<Movie>)
    suspend fun clearAll()
}