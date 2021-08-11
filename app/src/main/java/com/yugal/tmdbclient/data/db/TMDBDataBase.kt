package com.yugal.tmdbclient.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.yugal.tmdbclient.data.model.artist.Artist
import com.yugal.tmdbclient.data.model.movie.Movie
import com.yugal.tmdbclient.data.model.tvshow.TvShow

@Database(entities = [Movie::class, TvShow::class, Artist::class],
version = 1,
exportSchema = false)
abstract class TMDBDataBase : RoomDatabase() {
    abstract fun moviedao(): MovieDao
    abstract fun tvDao(): TvShowDao
    abstract fun artistDao(): ArtistDao
}