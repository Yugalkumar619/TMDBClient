package com.yugal.tmdbclient.domain.repository

import com.yugal.tmdbclient.data.model.artist.Artist

interface ArtistRepository {
    suspend fun getArtists():List<Artist>?
    suspend fun updateArtists():List<Artist>?
}