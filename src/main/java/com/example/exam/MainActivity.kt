package com.example.exam

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.exam.R

class MainActivity : AppCompatActivity() {

    // Parallel arrays to store data
    private val songs = arrayListOf("Money", "Work", "Bonnie and Clyde", "Her Heart")
    private val artists = arrayListOf("Cardi B", "Rihanna", "Tink", "Anthony Hamilton")
    private val ratings = arrayListOf(4, 1, 2, 3)
    private val comments = arrayListOf("Rap", "Dance song", "Best love song", "Memories")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addBtn = findViewById<Button>(R.id.btnAdd)
        val viewBtn = findViewById<Button>(R.id.btnView)
        val exitBtn = findViewById<Button>(R.id.btnExit)

        addBtn.setOnClickListener {
            val title = findViewById<EditText>(R.id.etSong).text.toString()
            val artist = findViewById<EditText>(R.id.etArtist).text.toString()
            val ratingStr = findViewById<EditText>(R.id.etRating).text.toString()
            val comment = findViewById<EditText>(R.id.etComment).text.toString()

            if (title.isBlank() || artist.isBlank() || ratingStr.isBlank() || comment.isBlank()) {
                Toast.makeText(this, "Please fill in all fields.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val rating = ratingStr.toIntOrNull()
            if (rating == null || rating !in 1..5) {
                Toast.makeText(this, "Rating must be a number between 1 and 5.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (songs.size < 4) {
                songs.add(title)
                artists.add(artist)
                ratings.add(rating)
                comments.add(comment)
                Toast.makeText(this, "Song added to playlist!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Playlist can only hold 4 songs.", Toast.LENGTH_SHORT).show()
            }
        }

        viewBtn.setOnClickListener {
            val intent = Intent(this, Details::class.java)
            intent.putStringArrayListExtra("songs", songs)
            intent.putStringArrayListExtra("artists", artists)
            intent.putIntegerArrayListExtra("ratings", ratings)
            intent.putStringArrayListExtra("comments", comments)
            startActivity(intent)
        }

        exitBtn.setOnClickListener {
            finish()
        }
    }
}
