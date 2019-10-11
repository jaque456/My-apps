package mx.edu.utng.completeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import java.security.Principal

class MainActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT:Long=8000


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            startActivity(Intent(this, PrincipalActivity:: class.java))
            finish()
        },  SPLASH_TIME_OUT)
    }
}

