package com.yugal.tmdbclient.domain.usecase

import com.yugal.tmdbclient.data.model.artist.Artist
import com.yugal.tmdbclient.domain.repository.ArtistRepository

class UpdateArtistUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.updateArtists()
}