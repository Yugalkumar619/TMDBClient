package com.yugal.tmdbclient.domain.usecase

import com.yugal.tmdbclient.data.model.movie.Movie
import com.yugal.tmdbclient.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>? = movieRepository.getMovies()
}