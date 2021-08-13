package com.yugal.tmdbclient.data.repository.artist.datasource

import com.yugal.tmdbclient.data.model.artist.Artist

interface ArtistLocalDataSource {
    suspend fun getArtistFromDB():List<Artist>
    suspend fun saveArtistToDB(artist: List<Artist>)
    suspend fun clearAll()
}