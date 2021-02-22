package mx.edu.itson.practica4_luisgarcia_174099

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome_page.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)

        btnStart.setOnClickListener {
            var intent: Intent = Intent(this, RegisterPage::class.java)
            startActivity(intent)
        }
    }
}