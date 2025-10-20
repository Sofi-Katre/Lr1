package com.example.lr1


import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // 1. Находим кнопку по ее ID
        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        val textView2 = findViewById<TextView>(R.id.textView2)
        // 2. Устанавливаем обработчик нажатия для кнопки
        button.setOnClickListener {
            // 3. Проверяем текущее состояние видимости первого текстового поля
            if (textView.visibility == View.VISIBLE) {
                // Если оно видимо, скрываем оба текстовых поля
                textView.visibility = View.GONE
                textView2.visibility = View.GONE
                button.text = "Показать"
            } else {
                // Если оно скрыто, показываем оба текстовых поля
                textView.visibility = View.VISIBLE
                textView2.visibility = View.VISIBLE
                button.text = "Скрыть"
            }
        }
        // 1. Находим кнопку по ее ID
        val btnImg = findViewById<ImageButton>(R.id.imageButton)
        val imgBtrFly = findViewById<ImageView>(R.id.imageView)
        // 2. Устанавливаем обработчик нажатия для кнопки
        btnImg.setOnClickListener {
            // 3. Проверяем текущее состояние видимости объекта
            if (imgBtrFly.visibility == View.VISIBLE){
                //Если он виден, то скрываем его
                imgBtrFly.visibility = View.GONE
            } else {
                // Если он скрыт, то делает его наоборот видимым
                imgBtrFly.visibility = View.VISIBLE
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}