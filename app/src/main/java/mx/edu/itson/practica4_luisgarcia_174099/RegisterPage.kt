package mx.edu.itson.practica4_luisgarcia_174099

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register_page.*

class RegisterPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)

        btnRegister.setOnClickListener {
            var intent: Intent = Intent(this, MenuPage::class.java)
            startActivity(intent)
        }
    }
}