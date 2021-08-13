package com.yugal.tmdbclient.data.repository.artist.datasource

import com.yugal.tmdbclient.data.model.artist.Artist
import com.yugal.tmdbclient.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDatasource {
    suspend fun getArtists():Response<ArtistList>
}