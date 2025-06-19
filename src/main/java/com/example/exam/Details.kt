package com.example.exam
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.exam.R

class Details : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val songs = intent.getStringArrayListExtra("songs") ?: arrayListOf()
        val artists = intent.getStringArrayListExtra("artists") ?: arrayListOf()
        val ratings = intent.getIntegerArrayListExtra("ratings") ?: arrayListOf()
        val comments = intent.getStringArrayListExtra("comments") ?: arrayListOf()

        val listView = findViewById<TextView>(R.id.tvList)
        val avgRatingView = findViewById<TextView>(R.id.tvAverage)
        val backBtn = findViewById<Button>(R.id.btnBack)

        val displayList = StringBuilder()
        for (i in songs.indices) {
            displayList.append("🎵 ${songs[i]} - ${artists[i]} (⭐ ${ratings[i]})\nComment: ${comments[i]}\n\n")
        }
        listView.text = displayList.toString()

        var sum = 0
        for (rating in ratings) {
            sum += rating
        }
        val average = if (ratings.isNotEmpty()) sum.toDouble() / ratings.size else 0.0
        avgRatingView.text = "Average Rating: %.1f".format(average)

        backBtn.setOnClickListener {
            finish()
        }
    }
}
