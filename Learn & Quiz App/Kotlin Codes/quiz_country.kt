package com.assignment.loginfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import com.assignment.loginfirebase.databinding.ActivityMainBinding
import com.assignment.loginfirebase.databinding.ActivityQuizCountryCBinding
import com.google.firebase.auth.FirebaseAuth

class QuizCountryC : AppCompatActivity() {

    var finalScore = 0
    private lateinit var binding: ActivityQuizCountryCBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        binding = ActivityQuizCountryCBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        val result1 = findViewById<TextView>(R.id.result1)
        val result2 = findViewById<TextView>(R.id.result2)
        val result3 = findViewById<TextView>(R.id.result3)
        val result4 = findViewById<TextView>(R.id.result4)
        val result5 = findViewById<TextView>(R.id.result5)
        val result6 = findViewById<TextView>(R.id.result6)
        val result7 = findViewById<TextView>(R.id.result7)
        val result8 = findViewById<TextView>(R.id.result8)
        val result9 = findViewById<TextView>(R.id.result9)
        val result10 = findViewById<TextView>(R.id.result10)
//
        val score = findViewById<TextView>(R.id.score)
//
        val q1r1 = findViewById<RadioButton>(R.id.q1o1)
        val q1r2 = findViewById<RadioButton>(R.id.q1o2)
        val q1r3 = findViewById<RadioButton>(R.id.q1o3)
//
        val q2r1 = findViewById<RadioButton>(R.id.q2o1)
        val q2r2 = findViewById<RadioButton>(R.id.q2o2)
        val q2r3 = findViewById<RadioButton>(R.id.q2o3)
//
        val q3r1 = findViewById<RadioButton>(R.id.q3o1)
        val q3r2 = findViewById<RadioButton>(R.id.q3o2)
        val q3r3 = findViewById<RadioButton>(R.id.q3o3)
//
        val q4r1 = findViewById<RadioButton>(R.id.q4o1)
        val q4r2 = findViewById<RadioButton>(R.id.q4o2)
        val q4r3 = findViewById<RadioButton>(R.id.q4o3)
//
        val q5r1 = findViewById<RadioButton>(R.id.q5o1)
        val q5r2 = findViewById<RadioButton>(R.id.q5o2)
        val q5r3 = findViewById<RadioButton>(R.id.q5o3)
//
        val q6r1 = findViewById<RadioButton>(R.id.q6o1)
        val q6r2 = findViewById<RadioButton>(R.id.q6o2)
        val q6r3 = findViewById<RadioButton>(R.id.q6o3)
//
        val q7r1 = findViewById<RadioButton>(R.id.q7o1)
        val q7r2 = findViewById<RadioButton>(R.id.q7o2)
        val q7r3 = findViewById<RadioButton>(R.id.q7o3)
        //
        val q8r1 = findViewById<RadioButton>(R.id.q8o1)
        val q8r2 = findViewById<RadioButton>(R.id.q8o2)
        val q8r3 = findViewById<RadioButton>(R.id.q8o3)
        //
        val q9r1 = findViewById<RadioButton>(R.id.q9o1)
        val q9r2 = findViewById<RadioButton>(R.id.q9o2)
        val q9r3 = findViewById<RadioButton>(R.id.q9o3)
        //
        val q10r1 = findViewById<RadioButton>(R.id.q10o1)
        val q10r2 = findViewById<RadioButton>(R.id.q10o2)
        val q10r3 = findViewById<RadioButton>(R.id.q10o3)
        //
        val button = findViewById<Button>(R.id.button)
//
        val r1 = findViewById<RadioGroup>(R.id.radio_group1)
        val r2 = findViewById<RadioGroup>(R.id.radio_group2)
        val r3 = findViewById<RadioGroup>(R.id.radio_group3)
        val r4 = findViewById<RadioGroup>(R.id.radio_group4)
        val r5 = findViewById<RadioGroup>(R.id.radio_group5)
        val r6 = findViewById<RadioGroup>(R.id.radio_group6)
        val r7 = findViewById<RadioGroup>(R.id.radio_group7)
        val r8 = findViewById<RadioGroup>(R.id.radio_group8)
        val r9 = findViewById<RadioGroup>(R.id.radio_group9)
        val r10 = findViewById<RadioGroup>(R.id.radio_group10)

//
        val reset = findViewById<Button>(R.id.reset)

        button.setOnClickListener {
            if (q1r1.isChecked) {
                finalScore -= 5
                result1.text = "Answer: Wrong"
            } else if (q1r2.isChecked) {
                finalScore += 10
                result1.text = "Answer: Correct"
            } else if (q1r3.isChecked) {
                finalScore -= 5
                result1.text = "Answer: Wrong"
            } else {
                result1.text = "Not Attempted!"
            }
            if (q2r1.isChecked) {
                finalScore -= 5
                result2.text = "Answer: Wrong"
            } else if (q2r3.isChecked) {
                finalScore += 10
                result2.text = "Answer: Correct"
            } else if (q2r2.isChecked) {
                finalScore -= 5
                result2.text = "Answer: Wrong"
            } else {
                result2.text = "Not Attempted!"
            }
            if (q3r1.isChecked) {
                finalScore -= 5
                result3.text = "Answer: Wrong"
            } else if (q3r2.isChecked) {
                finalScore += 10
                result3.text = "Answer: Correct"
            } else if (q3r3.isChecked) {
                finalScore -= 5
                result3.text = "Answer: Wrong"
            } else {
                result3.text = "Not Attempted!"
            }
            if (q4r2.isChecked) {
                finalScore -= 5
                result4.text = "Answer: Wrong"
            } else if (q4r1.isChecked) {
                finalScore += 10
                result4.text = "Answer: Correct"
            } else if (q4r3.isChecked) {
                finalScore -= 5
                result4.text = "Answer: Wrong"
            } else {
                result4.text = "Not Attempted!"
            }
            if (q5r2.isChecked) {
                finalScore -= 5
                result5.text = "Answer: Wrong"
            } else if (q5r1.isChecked) {
                finalScore += 10
                result5.text = "Answer: Correct"
            } else if (q5r3.isChecked) {
                finalScore -= 5
                result5.text = "Answer: Wrong"
            } else {
                result5.text = "Not Attempted!"
            }
//
            if (q6r1.isChecked) {
                finalScore -= 5
                result6.text = "Answer: Wrong"
            } else if (q6r2.isChecked) {
                finalScore -= 5
                result6.text = "Answer: Wrong"
            } else if (q6r3.isChecked) {
                finalScore += 10
                result6.text = "Answer: Correct"
            } else {
                result6.text = "Not Attempted!"
            }
//
            if (q7r1.isChecked) {
                finalScore -= 5
                result7.text = "Answer: Wrong"
            } else if (q7r2.isChecked) {
                finalScore += 10
                result7.text = "Answer: Correct"
            } else if (q7r3.isChecked) {
                finalScore -= 5
                result7.text = "Answer: Wrong"
            } else {
                result7.text = "Not Attempted!"
            }
//
            if (q8r1.isChecked) {
                finalScore -= 5
                result8.text = "Answer: Wrong"
            } else if (q8r2.isChecked) {
                finalScore += 10
                result8.text = "Answer: Correct"
            } else if (q8r3.isChecked) {
                finalScore -= 5
                result8.text = "Answer: Wrong"
            } else {
                result8.text = "Not Attempted!"
            }
//
            if (q9r1.isChecked) {
                finalScore -= 5
                result9.text = "Answer: Wrong"
            } else if (q9r2.isChecked) {
                finalScore -= 5
                result9.text = "Answer: Wrong"
            } else if (q9r3.isChecked) {
                finalScore += 10
                result9.text = "Answer: Correct"
            } else {
                result9.text = "Not Attempted!"
            }
//
            if (q10r1.isChecked) {
                finalScore += 10
                result10.text = "Answer: Correct"
            } else if (q10r2.isChecked) {
                finalScore -= 5
                result10.text = "Answer: Wrong"
            } else if (q10r3.isChecked) {
                finalScore -= 5
                result10.text = "Answer: Wrong"
            } else {
                result10.text = "Not Attempted!"
            }
//

            score.text = "Score: $finalScore"
//
            q1r1.isClickable = false
            q1r2.isClickable = false
            q1r3.isClickable = false
            q2r1.isClickable = false
            q2r2.isClickable = false
            q2r3.isClickable = false
            q3r1.isClickable = false
            q3r2.isClickable = false
            q3r3.isClickable = false
            q4r1.isClickable = false
            q4r2.isClickable = false
            q4r3.isClickable = false
            q5r1.isClickable = false
            q5r2.isClickable = false
            q5r3.isClickable = false
            q6r2.isClickable = false
            q6r1.isClickable = false
            q6r3.isClickable = false
            q7r2.isClickable = false
            q7r1.isClickable = false
            q7r3.isClickable = false
            q8r1.isClickable = false
            q8r2.isClickable = false
            q8r3.isClickable = false
            q9r1.isClickable = false
            q9r2.isClickable = false
            q9r3.isClickable = false
            q10r1.isClickable = false
            q10r2.isClickable = false
            q10r3.isClickable = false
//
            button.visibility = View.GONE
            reset.visibility = View.VISIBLE
        }
        reset.setOnClickListener {
            finalScore = 0
            score.text = ""
            result1.text = ""
            result2.text = ""
            result3.text = ""
            result4.text = ""
            result5.text = ""
            result6.text = ""
            result7.text = ""
            result8.text = ""
            result9.text = ""
            result10.text = ""
//
            r1.clearCheck()
            r2.clearCheck()
            r3.clearCheck()
            r4.clearCheck()
            r5.clearCheck()
            r6.clearCheck()
            r7.clearCheck()
            r8.clearCheck()
            r9.clearCheck()
            r10.clearCheck()
//
            q1r1.isClickable = true
            q1r2.isClickable = true
            q1r3.isClickable = true
            q2r1.isClickable = true
            q2r2.isClickable = true
            q2r3.isClickable = true
            q3r1.isClickable = true
            q3r2.isClickable = true
            q3r3.isClickable = true
            q4r1.isClickable = true
            q4r2.isClickable = true
            q4r3.isClickable = true
            q5r1.isClickable = true
            q5r2.isClickable = true
            q5r3.isClickable = true
            q6r2.isClickable = true
            q6r1.isClickable = true
            q6r3.isClickable = true
            q7r2.isClickable = true
            q7r1.isClickable = true
            q7r3.isClickable = true
            q8r1.isClickable = true
            q8r2.isClickable = true
            q8r3.isClickable = true
            q9r1.isClickable = true
            q9r2.isClickable = true
            q9r3.isClickable = true
            q10r1.isClickable = true
            q10r2.isClickable = true
            q10r3.isClickable = true
//
            reset.visibility = View.GONE
            button.visibility = View.VISIBLE
        }
    }
}
