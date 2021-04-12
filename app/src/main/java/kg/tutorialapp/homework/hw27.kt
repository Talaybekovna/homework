package kg.tutorialapp.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

class hw27 : AppCompatActivity() {
    private lateinit var btnRed: Button
    private lateinit var btnYellow: Button
    private lateinit var btnGreen: Button
    private lateinit var tvInfo: TextView
    private lateinit var layoutRoot: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hw27)

        btnRed = findViewById(R.id.btnRed)
        btnYellow = findViewById(R.id.btnYellow)
        btnGreen = findViewById(R.id.btnGreen)
        tvInfo = findViewById(R.id.tvInfo)
        layoutRoot = findViewById(R.id.layoutRoot)

    }

    fun onClickBtn(v: View){
        when(v.id){
            R.id.btnRed -> {
                layoutRoot.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                tvInfo.setText(R.string.red)
            }
            R.id.btnYellow -> {
                layoutRoot.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow))
                tvInfo.setText(R.string.yellow)
            }
            R.id.btnGreen -> {
                layoutRoot.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                tvInfo.setText(R.string.green)
            }
        }
    }
}