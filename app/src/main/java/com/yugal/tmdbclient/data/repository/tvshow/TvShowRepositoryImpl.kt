package com.yugal.tmdbclient.data.repository.tvshow

import android.util.Log
import com.yugal.tmdbclient.data.model.tvshow.TvShow
import com.yugal.tmdbclient.data.model.tvshow.TvShowList
import com.yugal.tmdbclient.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.yugal.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.yugal.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.yugal.tmdbclient.domain.repository.TvShowRepository
import retrofit2.Response

class TvShowRepositoryImpl(
    private val tvShowRemoteDatasource: TvShowRemoteDatasource,
    private val tvShowLocalDataSource: TvShowLocalDataSource,
    private val tvShowCacheDataSource: TvShowCacheDataSource

):TvShowRepository {
    override suspend fun getTvShows(): List<TvShow>? {
        return getTvShowsFromCache()
    }

    override suspend fun updateTvShows(): List<TvShow>? {
        val newListOfTvShows:List<TvShow> = getTvShowsFromAPI()
        tvShowLocalDataSource.clearAll()
        tvShowLocalDataSource.saveTvShowsToDB(newListOfTvShows)
        tvShowCacheDataSource.saveTvShowsToCache(newListOfTvShows)
        return newListOfTvShows
    }

    suspend fun getTvShowsFromAPI():List<TvShow>{
        lateinit var tvShowList:List<TvShow>
        try {
            val response: Response<TvShowList> = tvShowRemoteDatasource.getTvShows()
            val body: TvShowList? = response.body()
            if (body!=null){
                tvShowList = body.tvShows
            }
        }catch (exception:Exception){
            Log.i("MyTag",exception.message.toString())
        }
        return tvShowList
    }


    suspend fun getTvShowsFromDB():List<TvShow>{
        lateinit var tvShowList:List<TvShow>
        try {
            tvShowList = tvShowLocalDataSource.getTvShowsFromDB()
        }catch (exception:Exception){
            Log.i("MyTag",exception.message.toString())
        }
        if (tvShowList.size>0){
            return tvShowList
        }else{
            tvShowList = getTvShowsFromAPI()
            tvShowLocalDataSource.saveTvShowsToDB(tvShowList)
        }
        return tvShowList
    }

    suspend fun getTvShowsFromCache():List<TvShow>{
        lateinit var tvShowList:List<TvShow>
        try {
            tvShowList = tvShowCacheDataSource.getTvShowsFromCache()
        }catch (exception:java.lang.Exception){
            Log.i("MyTag",exception.message.toString())
        }
        if (tvShowList.size>0){
            return tvShowList
        }else{
            tvShowList = getTvShowsFromDB()
            tvShowCacheDataSource.saveTvShowsToCache(tvShowList)
        }
        return tvShowList
    }
}