package com.example.responsi190

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "Login"
        }

        btn_login.setOnClickListener {
            val bundle = intent.extras
            val namacoy = bundle?.get("nama1").toString()
            val emailcoy = bundle?.get("email1").toString()
            val passcoy = bundle?.get("pass1").toString()

            val namanya: EditText = findViewById(R.id.name)
            val namanyamas = namanya.text.toString()
            val passnya: EditText = findViewById(R.id.password)
            val passnyamas = passnya.text.toString()

            if (namanyamas.isEmpty()|| passnyamas.isEmpty()) {
                Toast.makeText(this, "Please Insert Name and Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if(namanyamas == namacoy && passnyamas == passcoy){
                val intent = Intent (this,HomeActivity::class.java)
                intent.putExtra("nama2",namacoy)
                intent.putExtra("email2",emailcoy)
                startActivity(intent)
            }else {
                Toast.makeText(this,"Email dan password Anda salah!", Toast.LENGTH_SHORT).show()
            }
        }

        btn_link_signup.setOnClickListener{
            intent = Intent(this,ActivityRegister::class.java)
            startActivity(intent)
        }
    }
}
