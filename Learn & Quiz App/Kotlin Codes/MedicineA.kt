package com.assignment.loginfirebase.Answers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.assignment.loginfirebase.Questions.MedicineQ
import com.assignment.loginfirebase.databinding.ActivityMedicineBinding
import com.google.firebase.auth.FirebaseAuth

class MedicineA : AppCompatActivity() {

    private lateinit var binding: ActivityMedicineBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        binding = ActivityMedicineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()
        binding.backs.setOnClickListener() {
            Toast.makeText(this, "Back!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MedicineQ::class.java)
            startActivity(intent)
        }
    }
}