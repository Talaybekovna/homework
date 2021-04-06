package kg.tutorialapp.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class hw25 : AppCompatActivity() {
    var edNum1: EditText? = null
    var edNum2: EditText? = null
    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnMult: Button
    lateinit var btnDiv: Button
    lateinit var textRes: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hw25)

        edNum1 = findViewById(R.id.edNum1)
        edNum2 = findViewById(R.id.edNum2)

        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSub)
        btnMult = findViewById(R.id.btnMult)
        btnDiv = findViewById(R.id.btnDiv)

        textRes = findViewById(R.id.textRes)

    }

    fun clickBtn(view: View) {
        val num1 = edNum1?.text.toString().toInt()
        val num2 = edNum2?.text.toString().toInt()

        when(view.id){
            R.id.btnAdd -> textRes.text = ("$num1 + $num2 = ${num1 + num2}").toString()
            R.id.btnSub -> textRes.text = ("$num1 - $num2 = ${num1 - num2}").toString()
            R.id.btnMult -> textRes.text = ("$num1 * $num2 = ${num1 * num2}").toString()
            R.id.btnDiv -> if(num2 == 0) textRes.text = "На ноль делить нельзя!"
            else textRes.text = ("$num1 / $num2 = ${num1 / num2}").toString()
        }
    }
}