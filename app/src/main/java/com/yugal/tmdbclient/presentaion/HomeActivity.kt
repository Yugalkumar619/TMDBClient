package com.yugal.tmdbclient.presentaion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yugal.tmdbclient.R
import com.yugal.tmdbclient.databinding.ActivityHomeBinding
import com.yugal.tmdbclient.presentaion.artist.ArtistActivity
import com.yugal.tmdbclient.presentaion.movie.MovieActivity
import com.yugal.tmdbclient.presentaion.tv.TvShowActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_home)
        binding.movieButton.setOnClickListener{
            val intent = Intent(this,MovieActivity::class.java)
            startActivity(intent)
        }
        binding.tvButton.setOnClickListener{
            val intent = Intent(this,TvShowActivity::class.java)
            startActivity(intent)
        }
        binding.artistButton.setOnClickListener{
            val intent = Intent(this, ArtistActivity::class.java)
            startActivity(intent)
        }
    }
}