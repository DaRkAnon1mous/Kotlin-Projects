package com.assignment.loginfirebase.Answers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.assignment.loginfirebase.Questions.EntertainmentQ
import com.assignment.loginfirebase.databinding.ActivityEntertainmentBinding
import com.google.firebase.auth.FirebaseAuth

class EntertainmentA : AppCompatActivity() {

    private lateinit var binding: ActivityEntertainmentBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        binding = ActivityEntertainmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()
        binding.backs.setOnClickListener() {
            Toast.makeText(this, "Back!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, EntertainmentQ::class.java)
            startActivity(intent)
        }
    }
}