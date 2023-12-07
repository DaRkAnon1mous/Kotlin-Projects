package com.assignment.loginfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.assignment.loginfirebase.databinding.ActivityMainBinding
import com.assignment.loginfirebase.databinding.ActivitySignInBinding
import com.assignment.loginfirebase.databinding.ActivitySignUpBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        if(firebaseAuth.currentUser != null) {
            firebaseAuth.currentUser?.let {
                binding.display.text = it.email
            }
        }

        binding.btnlogout.setOnClickListener{
            firebaseAuth.signOut()
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}