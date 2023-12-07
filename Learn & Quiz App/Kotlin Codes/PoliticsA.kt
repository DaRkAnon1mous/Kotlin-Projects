package com.assignment.loginfirebase.Answers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.assignment.loginfirebase.Questions.PoliticsQ
import com.assignment.loginfirebase.databinding.ActivityPoliticsBinding
import com.google.firebase.auth.FirebaseAuth

class PoliticsA : AppCompatActivity() {

    private lateinit var binding: ActivityPoliticsBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        binding = ActivityPoliticsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()
        binding.backs.setOnClickListener() {
            Toast.makeText(this, "Back!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, PoliticsQ::class.java)
            startActivity(intent)
        }
    }
}