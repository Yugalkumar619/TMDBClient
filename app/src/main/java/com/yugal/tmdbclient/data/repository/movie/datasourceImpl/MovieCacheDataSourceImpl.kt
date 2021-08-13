package com.yugal.tmdbclient.data.repository.movie.datasourceImpl

import com.yugal.tmdbclient.data.model.movie.Movie
import com.yugal.tmdbclient.data.repository.movie.datasource.MovieCacheDataSource

class MovieCacheDataSourceImpl: MovieCacheDataSource {
    private var movieList = ArrayList<Movie>()
    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movie: List<Movie>) {
       movieList.clear()
        movieList = ArrayList(movie)
    }
}