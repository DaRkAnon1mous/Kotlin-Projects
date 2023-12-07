package com.assignment.loginfirebase.Answers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.assignment.loginfirebase.Questions.LifestyleQ
import com.assignment.loginfirebase.databinding.ActivityLifestyleBinding
import com.google.firebase.auth.FirebaseAuth

class LifestyleA : AppCompatActivity() {

    private lateinit var binding: ActivityLifestyleBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        binding = ActivityLifestyleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()
        binding.backs.setOnClickListener() {
            Toast.makeText(this, "Back!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LifestyleQ::class.java)
            startActivity(intent)
        }
    }
}