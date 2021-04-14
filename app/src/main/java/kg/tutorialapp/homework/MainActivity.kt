package kg.tutorialapp.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickGoTo (v: View){
        when(v.id){
            R.id.btn_hw_21 -> {
                val i = Intent(this, hw21::class.java)
                startActivity(i)
            }
            R.id.btn_hw_22 -> {
                val i = Intent(this, hw22::class.java)
                startActivity(i)
            }
            R.id.btn_hw_23 -> {
                val i = Intent(this, hw23::class.java)
                startActivity(i)
            }
            R.id.btn_hw_24 -> {
                val i = Intent(this, hw24::class.java)
                startActivity(i)
            }
            R.id.btn_hw_25 -> {
                val i = Intent(this, hw25::class.java)
                startActivity(i)
            }
            R.id.btn_hw_26 -> {
                val i = Intent(this, hw26::class.java)
                startActivity(i)
            }
            R.id.btn_hw_27 -> {
                val i = Intent(this, hw27::class.java)
                startActivity(i)
            }
            R.id.btn_hw_28 -> {
                val i = Intent(this, hw28::class.java)
                startActivity(i)
            }
        }
    }
}