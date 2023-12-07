package com.assignment.loginfirebase.Answers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.assignment.loginfirebase.Questions.SportsQ
import com.assignment.loginfirebase.databinding.ActivitySportsBinding
import com.google.firebase.auth.FirebaseAuth

class SportsA : AppCompatActivity() {

    private lateinit var binding: ActivitySportsBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        binding = ActivitySportsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()
        binding.backs.setOnClickListener() {
            Toast.makeText(this, "Back!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SportsQ::class.java)
            startActivity(intent)
        }
    }
}