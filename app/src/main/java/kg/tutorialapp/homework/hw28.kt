package kg.tutorialapp.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder

class hw28 : AppCompatActivity() {
    lateinit var tvInput: TextView
    lateinit var tvResult: TextView
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var btn4: Button
    lateinit var btn5: Button
    lateinit var btn6: Button
    lateinit var btn7: Button
    lateinit var btn8: Button
    lateinit var btn9: Button
    lateinit var btn0: Button
    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnMult: Button
    lateinit var btnDiv: Button
    lateinit var btnAC: Button
    lateinit var btnBack: Button
    lateinit var btnDot: Button
    lateinit var btnEqual: Button
    lateinit var btnOpenedBrace: Button
    lateinit var btnClosedBrace: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hw28)

        tvInput = findViewById(R.id.tvInput)
        tvResult = findViewById(R.id.tvResult)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btn0 = findViewById(R.id.btn0)
        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSub)
        btnDiv = findViewById(R.id.btnDiv)
        btnMult = findViewById(R.id.btnMult)
        btnDot = findViewById(R.id.btnDot)
        btnBack = findViewById(R.id.btnBack)
        btnAC = findViewById(R.id.btnAC)
        btnEqual = findViewById(R.id.btnEqual)
        btnOpenedBrace = findViewById(R.id.btnOpenedBrace)
        btnClosedBrace = findViewById(R.id.btnClosedBrace)


        btn1.setOnClickListener {
            digit_to_screen("1")
        }

        btn2.setOnClickListener {
            digit_to_screen("2")
        }

        btn3.setOnClickListener {
            digit_to_screen("3")
        }

        btn4.setOnClickListener {
            digit_to_screen("4")
        }

        btn5.setOnClickListener {
            digit_to_screen("5")
        }

        btn6.setOnClickListener {
            digit_to_screen("6")
        }

        btn7.setOnClickListener {
            digit_to_screen("7")
        }

        btn8.setOnClickListener {
            digit_to_screen("8")
        }

        btn9.setOnClickListener {
            digit_to_screen("9")
        }

        btn0.setOnClickListener {
            digit_to_screen("0")
        }

        btnAdd.setOnClickListener {
            digit_to_screen("+")
        }

        btnSub.setOnClickListener {
            digit_to_screen("-")
        }

        btnMult.setOnClickListener {
            digit_to_screen("*")
        }

        btnDiv.setOnClickListener {
            digit_to_screen("/")
        }

        btnDot.setOnClickListener {
            digit_to_screen(".")
        }

        btnOpenedBrace.setOnClickListener {
            digit_to_screen("(")
        }

        btnClosedBrace.setOnClickListener {
            digit_to_screen(")")
        }

        btnBack.setOnClickListener {
            val input = tvInput.text.toString()
            tvInput.text = input.substring(0, input.length - 1)
        }

        btnAC.setOnClickListener {
            tvInput.text = ""
            tvResult.text = ""
        }

        btnEqual.setOnClickListener {
            try {
                val expres = ExpressionBuilder(tvInput.text.toString()).build()
                val result = expres.evaluate()
                val longr = result.toLong()
                if (result == longr.toDouble())
                    tvResult.text = longr.toString()
                else
                    tvResult.text = result.toString()
            } catch (e: Exception){
                Log.d("Внимание", "код:${e.message}")
            }
        }

    }

    fun digit_to_screen(digit: String) {
        tvInput.append(tvResult.text)
        tvInput.append(digit)
        tvResult.text = ""
    }

}