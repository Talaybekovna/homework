package kg.tutorialapp.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.Chronometer

class hw26 : AppCompatActivity() {
    lateinit var chronometer: Chronometer
    lateinit var btnStart: Button
    lateinit var btnStop: Button
    lateinit var btnReset: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hw26)

        chronometer = findViewById(R.id.chronometer)
        btnStart = findViewById(R.id.buttonStart)
        btnStop = findViewById(R.id.buttonStop)
        btnReset = findViewById(R.id.buttonReset)

        btnStart.setOnClickListener {
            chronometer.start()
        }

        btnStop.setOnClickListener {
            chronometer.stop()
        }

        btnReset.setOnClickListener {
            chronometer.base = SystemClock.elapsedRealtime()
        }
    }
}