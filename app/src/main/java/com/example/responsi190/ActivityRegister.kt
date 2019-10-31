package com.example.responsi190

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class ActivityRegister : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "Register"
        }

        val namane: EditText = findViewById(R.id.name)
        val emaile: EditText = findViewById(R.id.email)
        val passe: EditText = findViewById(R.id.password)

        btn_signup.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            intent.putExtra("nama1",namane.text)
            intent.putExtra("email1",emaile.text)
            intent.putExtra("pass1",passe.text)
            Toast.makeText(this,"Berhasi Terdaftar!", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
        btn_link_login.setOnClickListener{
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
