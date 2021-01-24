package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recylerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recylerView = findViewById(R.id.recylerView)
        val icons = ArrayList<icons>()
        icons.add(icons(1, "GAMES", R.drawable.ic_baseline_games_24))
        icons.add(icons(2, "MUSICS", R.drawable.ic_baseline_music_note_24))
        icons.add(icons(3, "FILES", R.drawable.ic_baseline_file_copy_24))
        icons.add(icons(4, "KEYBOARD", R.drawable.ic_baseline_keyboard_24))
        icons.add(icons(5, "TRASNPORT", R.drawable.ic_baseline_directions_car_24))
        icons.add(icons(6, "BOOKS", R.drawable.ic_baseline_menu_book_24))
        icons.add(icons(7, "PHOTOS", R.drawable.ic_baseline_image_24))
        icons.add(icons(8, "APP", R.drawable.ic_baseline_android_24))
        icons.add(icons(9, "LAPTOPS", R.drawable.ic_baseline_laptop_24))
        icons.add(icons(10, "SMARTPHONES", R.drawable.ic_baseline_smartphone_24))


        val adapter = IconAdapter(icons)

        recylerView.adapter = adapter
        recylerView.layoutManager = LinearLayoutManager(this)
    }
}