package kg.tutorialapp.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class hw24 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hw24)

        val text = findViewById<TextView>(R.id.textAnimal)
        val dog = findViewById<ImageView>(R.id.imageDog)
        val cat = findViewById<ImageView>(R.id.imageCat)
        val hamster = findViewById<ImageView>(R.id.imageHamster)

        dog.setOnClickListener {
            text.text = "Собака"
        }

        cat.setOnClickListener {
            text.text = "Кошка"
        }

        hamster.setOnClickListener {
            text.text = "Хомяк"
        }

    }
}