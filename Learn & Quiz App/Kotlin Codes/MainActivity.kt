package com.assignment.loginfirebase.basic_activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.assignment.loginfirebase.Questions.LifestyleQ
import com.assignment.loginfirebase.Questions.*
import com.assignment.loginfirebase.QuizBio
import com.assignment.loginfirebase.QuizCosmo
import com.assignment.loginfirebase.QuizCountryC
import com.assignment.loginfirebase.QuizGK
import com.assignment.loginfirebase.databinding.ActivityMainBinding
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

        binding.qgk.setOnClickListener() {
            Toast.makeText(this, "GK Quiz!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, QuizGK::class.java)
            startActivity(intent)
        }

        binding.qcc.setOnClickListener() {
            Toast.makeText(this, "Country Capital Quiz!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, QuizCountryC::class.java)
            startActivity(intent)
        }

        binding.qbio.setOnClickListener() {
            Toast.makeText(this, "Biology Quiz!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, QuizBio::class.java)
            startActivity(intent)
        }

        binding.qCosmo.setOnClickListener() {
            Toast.makeText(this, "Cosmology Quiz!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, QuizCosmo::class.java)
            startActivity(intent)
        }

        binding.sci.setOnClickListener() {
            Toast.makeText(this, "Science Questions!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ScienceQ::class.java)
            startActivity(intent)
        }

        binding.sport.setOnClickListener() {
            Toast.makeText(this, "Sports Questions!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SportsQ::class.java)
            startActivity(intent)
        }

        binding.lstyle.setOnClickListener() {
            Toast.makeText(this, "Lifestyle Questions!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LifestyleQ::class.java)
            startActivity(intent)
        }

        binding.lit.setOnClickListener() {
            Toast.makeText(this, "Literature Questions!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LiteratureQ::class.java)
            startActivity(intent)
        }

        binding.med.setOnClickListener() {
            Toast.makeText(this, "Medicine Questions!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MedicineQ::class.java)
            startActivity(intent)
        }

        binding.poli.setOnClickListener() {
            Toast.makeText(this, "Politics Questions!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, PoliticsQ::class.java)
            startActivity(intent)
        }

        binding.ent.setOnClickListener() {
            Toast.makeText(this, "Entertainment Questions!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, EntertainmentQ::class.java)
            startActivity(intent)
        }

        binding.lout.setOnClickListener() {
            Toast.makeText(this, "LogOut User!!", Toast.LENGTH_SHORT).show()
            FirebaseAuth.getInstance().signOut();
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}