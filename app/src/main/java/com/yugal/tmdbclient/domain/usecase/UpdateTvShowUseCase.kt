package com.yugal.tmdbclient.domain.usecase

import com.yugal.tmdbclient.data.model.tvshow.TvShow
import com.yugal.tmdbclient.domain.repository.TvShowRepository

class UpdateTvShowUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>? = tvShowRepository.updateTvShows()
}