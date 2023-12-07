package com.assignment.loginfirebase.Answers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.assignment.loginfirebase.Questions.ScienceQ
import com.assignment.loginfirebase.databinding.ActivityScienceBinding
import com.google.firebase.auth.FirebaseAuth

class ScienceA : AppCompatActivity() {

    private lateinit var binding: ActivityScienceBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        binding = ActivityScienceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.back.setOnClickListener() {
            Toast.makeText(this, "Back!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ScienceQ::class.java)
            startActivity(intent)
        }
    }
}