package com.example.samplelibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import com.AlertMessage
import com.example.samplelibrary.databinding.ActivityMainBinding

class   MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun onClick(v: View){
        when (v){
            binding.btnShowMessage->{
                AlertMessage.showMessage(this, getString(R.string.app_name), "Hey there m8, this is my library alert :)"){
                    Toast.makeText(this, "Dismiss callback", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }


}