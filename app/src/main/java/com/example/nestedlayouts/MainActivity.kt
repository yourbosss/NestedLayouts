package com.example.nestedlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var button1: Button
    private lateinit var text1: TextView
    private lateinit var text2: TextView
    private lateinit var text3: TextView
    private lateinit var text4: TextView
    private lateinit var text5: TextView
    private lateinit var text6: TextView
    private lateinit var text7: TextView
    private lateinit var text8: TextView
    private lateinit var text9: TextView

    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 = findViewById(R.id.button1)

        text1 = findViewById(R.id.text1)
        text2 = findViewById(R.id.text2)
        text3 = findViewById(R.id.text3)

        text4 = findViewById(R.id.text4)
        text5 = findViewById(R.id.text5)
        text6 = findViewById(R.id.text6)

        text7 = findViewById(R.id.text7)
        text8 = findViewById(R.id.text8)
        text9 = findViewById(R.id.text9)

        button1.setOnClickListener() { view: View ->
            if (currentIndex == 0) {

                text2.setText((text1.text.toString().toInt() + 1).toString())
                text5.setText((text4.text.toString().toInt() + 1).toString())
                text8.setText((text7.text.toString().toInt() + 1).toString())

                text1.setText("")
                text4.setText("")
                text7.setText("")

                ++currentIndex
            } else if (currentIndex == 1) {
                text3.setText((text2.text.toString().toInt() + 1).toString())
                text6.setText((text5.text.toString().toInt() + 1).toString())
                text9.setText((text8.text.toString().toInt() + 1).toString())

                text2.setText("")
                text5.setText("")
                text8.setText("")

                ++currentIndex
            } else if (currentIndex == 2) {
                text1.setText((text3.text.toString().toInt() + 1).toString())
                text4.setText((text6.text.toString().toInt() + 1).toString())
                text7.setText((text9.text.toString().toInt() + 1).toString())

                text3.setText("")
                text6.setText("")
                text8.setText("")

                currentIndex = 0
            }
        }
    }
}
    
