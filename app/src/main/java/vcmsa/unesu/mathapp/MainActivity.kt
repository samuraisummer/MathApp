@file:Suppress("DEPRECATION", "NAME_SHADOWING")

package vcmsa.unesu.mathapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@Suppress("UNUSED_VARIABLE")
class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
            //code starts here

        val input1 = findViewById<EditText>(R.id.edTfirstnum)
        val input2 = findViewById<EditText>(R.id.edTsecondnumber)
        val clickMe = findViewById<Button>(R.id.btnAdd)
        val textView = findViewById<TextView>(R.id.txtSum)
        //set onClickListener for the button
        clickMe.setOnClickListener {
                //try to turn the string into a number
                val numberInt = input1.text.toString().toInt()
            val input2 = input2.text.toString().toInt()
            val sum = numberInt.toInt() + input2.toInt()
            textView.text = "Result: $sum"
        }
    }
}








       