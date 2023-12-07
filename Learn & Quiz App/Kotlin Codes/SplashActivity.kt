package com.assignment.loginfirebase.basic_activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.assignment.loginfirebase.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide();

        val handler = Handler(Looper.getMainLooper())

        handler.postDelayed({
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
            finish()
        },4000)
    }
}