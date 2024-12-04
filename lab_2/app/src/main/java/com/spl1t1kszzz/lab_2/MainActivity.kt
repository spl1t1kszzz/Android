package com.spl1t1kszzz.lab_2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val recyclerView: RecyclerView = findViewById(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val songList = listOf(
            Song("Song 1", "Artist 1", R.color.red),
            Song("Song 2", "Artist 1", R.color.purple),
            Song("Song 3", "Artist 1", R.color.white),
            Song("Song 4", "Artist 2", R.color.green),
            Song("Song 5", "Artist 2", R.color.purple),
            Song("Song 6", "Artist 2", R.color.white),
            Song("Song 7", "Artist 3", R.color.green),
            Song("Song 8", "Artist 3", R.color.purple),
            Song("Song 9", "Artist 3", R.color.white),
            Song("Song 10", "Artist 4", R.color.green),
            Song("Song 11", "Artist 4", R.color.purple),
            Song("Song 12", "Artist 4", R.color.white),
            )

        recyclerView.adapter = SongAdapter(songList)
    }
}