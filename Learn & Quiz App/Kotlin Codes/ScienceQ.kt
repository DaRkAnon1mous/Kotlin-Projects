package com.assignment.loginfirebase.Questions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.assignment.loginfirebase.Answers.ScienceA
import com.assignment.loginfirebase.basic_activities.MainActivity
import com.assignment.loginfirebase.databinding.ActivityScienceQBinding
import com.google.firebase.auth.FirebaseAuth

class ScienceQ : AppCompatActivity() {

    private lateinit var binding: ActivityScienceQBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        binding = ActivityScienceQBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.home.setOnClickListener() {
            Toast.makeText(this, "Back to Home!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.ans.setOnClickListener() {
            Toast.makeText(this, "Answers-", Toast.LENGTH_SHORT).show()
            FirebaseAuth.getInstance().signOut();
            val intent = Intent(this, ScienceA::class.java)
            startActivity(intent)
        }
    }
}