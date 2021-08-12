package com.yugal.tmdbclient.domain.repository

import com.yugal.tmdbclient.data.model.movie.Movie

interface MovieRepository {
    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies():List<Movie>?
}