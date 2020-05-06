package com.example.thp101

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnsave.setOnClickListener { goToProfilActivity() }
    }

    private fun goToProfilActivity() {
        val intent = Intent(this, ProfilActivity::class.java)
        startActivity(intent)
    }
}
