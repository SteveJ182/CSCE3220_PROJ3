package com.example.csce3220_proj3
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private var currentIndex = 0
    private val imageResources = arrayOf(
        R.drawable.story_image6,
        R.drawable.story_image7,
        R.drawable.story_image9,
        // Add more image resources as needed
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        val buttonPrev: Button = findViewById(R.id.buttonPrev)
        val buttonNext: Button = findViewById(R.id.buttonNext)
        val buttonSave: Button = findViewById(R.id.buttonSave)

        updateImage()

        buttonPrev.setOnClickListener {
            showPreviousImage()
        }

        buttonNext.setOnClickListener {
            showNextImage()
        }

        buttonSave.setOnClickListener {
            saveImage()
        }
    }

    private fun updateImage() {
        imageView.setImageResource(imageResources[currentIndex])
    }

    private fun showPreviousImage() {
        if (currentIndex > 0) {
            currentIndex--
            updateImage()
        }
    }

    private fun showNextImage() {
        if (currentIndex < imageResources.size - 1) {
            currentIndex++
            updateImage()
        }
    }

    private fun saveImage() {
        // Implement image saving functionality here
        // You can use Image Saving libraries or built-in methods
        // Example: Saving current image to storage
        // val drawable = resources.getDrawable(imageResources[currentIndex], theme)
        // // Save 'drawable' to storage using File I/O or library methods
    }
}
