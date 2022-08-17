package com.aras.kurye

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.aras.kurye.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener{

            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()

            if(email.equals("melikesert@araskargo.com.tr") && password.equals("Qwer1234***")){
                Toast.makeText(this, "Giriş başarılı", Toast.LENGTH_SHORT).show()
                val intent = Intent(this,HomePageActivity::class.java)
                startActivity(intent)
            }
            else if(email.equals("melikeyildirim@araskargo.com.tr") && password.equals("Qwer1234***")){
                Toast.makeText(this, "Giriş başarılı", Toast.LENGTH_SHORT).show()
                val intent = Intent(this,HomePageActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Parola yanlış", Toast.LENGTH_SHORT).show()
            }

        }




    }
}