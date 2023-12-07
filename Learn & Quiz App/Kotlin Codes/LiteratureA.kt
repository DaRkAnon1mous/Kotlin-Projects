package com.assignment.loginfirebase.Answers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.assignment.loginfirebase.Questions.LiteratureQ
import com.assignment.loginfirebase.databinding.ActivityLiteratureBinding
import com.google.firebase.auth.FirebaseAuth

class LiteratureA : AppCompatActivity() {

    private lateinit var binding: ActivityLiteratureBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        binding = ActivityLiteratureBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()
        binding.backs.setOnClickListener() {
            Toast.makeText(this, "Back!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LiteratureQ::class.java)
            startActivity(intent)
        }
    }
}