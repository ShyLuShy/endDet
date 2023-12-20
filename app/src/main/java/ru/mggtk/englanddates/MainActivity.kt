package ru.mggtk.englanddates

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Button: Button = findViewById(R.id.AboutButton)
        val TextViewButton1: TextView = findViewById(R.id.eraone)
        val TextViewButton2: TextView = findViewById(R.id.eratwo)
        val TextViewButton3: TextView = findViewById(R.id.erathree)
        val TextViewButton4: TextView = findViewById(R.id.textView13)
        val TextViewButton5: TextView = findViewById(R.id.textView5)
        val TextViewButton6: TextView = findViewById(R.id.textView16)
        val TextViewButton7: TextView = findViewById(R.id.textView17)
        val TextViewButton8: TextView = findViewById(R.id.textView18)
        val TextViewButton9: TextView = findViewById(R.id.textView19)
        val TextViewButton10: TextView = findViewById(R.id.textView20)
        val TextViewButton11: TextView = findViewById(R.id.textView21)
        val TextViewButton12: TextView = findViewById(R.id.textView22)
        val TextViewButton13: TextView = findViewById(R.id.textView23)
        val TextViewButton14: TextView = findViewById(R.id.textView24)
        val TextViewButton15: TextView = findViewById(R.id.textView25)
        val TextViewButton16: TextView = findViewById(R.id.textView26)
        val TextViewButton17: TextView = findViewById(R.id.textView27)
        val TextViewButton18: TextView = findViewById(R.id.textView28)

        TextViewButton18.setOnClickListener {
            intent = Intent(this@MainActivity, Infoeighteen::class.java)
            startActivity(intent)
        }

        TextViewButton17.setOnClickListener {
            intent = Intent(this@MainActivity, Infoseventeen::class.java)
            startActivity(intent)
        }

        TextViewButton16.setOnClickListener {
            intent = Intent(this@MainActivity, Infosixteen::class.java)
            startActivity(intent)
        }

        TextViewButton15.setOnClickListener {
            intent = Intent(this@MainActivity, Infofifteen::class.java)
            startActivity(intent)
        }

        TextViewButton14.setOnClickListener {
            intent = Intent(this@MainActivity, Infofourteen::class.java)
            startActivity(intent)
        }

        TextViewButton13.setOnClickListener {
            intent = Intent(this@MainActivity, Infothirteen::class.java)
            startActivity(intent)
        }

        TextViewButton12.setOnClickListener {
            intent = Intent(this@MainActivity, InfoTwelwe::class.java)
            startActivity(intent)
        }

        TextViewButton11.setOnClickListener {
            intent = Intent(this@MainActivity, InfoEleven::class.java)
            startActivity(intent)
        }

        TextViewButton10.setOnClickListener {
            intent = Intent(this@MainActivity, InfoTen::class.java)
            startActivity(intent)
        }

        TextViewButton9.setOnClickListener {
            intent = Intent(this@MainActivity, InfoNine::class.java)
            startActivity(intent)
        }

        TextViewButton8.setOnClickListener {
            intent = Intent(this@MainActivity, InfoEight::class.java)
            startActivity(intent)
        }

        TextViewButton7.setOnClickListener {
            intent = Intent(this@MainActivity, InfoSeven::class.java)
            startActivity(intent)
        }

        TextViewButton6.setOnClickListener {
            intent = Intent(this@MainActivity, InfoSix::class.java)
            startActivity(intent)
        }

        TextViewButton5.setOnClickListener {
            intent = Intent(this@MainActivity, InfoFive::class.java)
            startActivity(intent)
        }

        TextViewButton4.setOnClickListener {
            intent = Intent(this@MainActivity, InfoFour::class.java)
            startActivity(intent)
        }

        TextViewButton3.setOnClickListener {
            intent = Intent(this@MainActivity, InfoThree::class.java)
            startActivity(intent)
        }

        TextViewButton2.setOnClickListener {
            intent = Intent(this@MainActivity, InfoTwo::class.java)
            startActivity(intent)
        }
        TextViewButton1.setOnClickListener {
            intent = Intent(this@MainActivity, InfoOne::class.java)
            startActivity(intent)
        }
        Button.setOnClickListener{
            showAboutDialog(this)
        }
        }
        }
    private fun showAboutDialog(context: Context) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle("О программе")
        val message = "Программа повествует нам о эпохах Английской истории, начиная с одинадцатого века по современность" //текст
        builder.setMessage(message)

        builder.setPositiveButton("OK") { dialog, which ->
            dialog.dismiss()
        }



        val dialog = builder.create()
        dialog.show()
    }
