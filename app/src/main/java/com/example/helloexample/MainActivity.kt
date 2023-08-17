package com.example.helloexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.helloexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // important

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        binding.buttonHello.setOnClickListener {
            val name = binding.editTextName.text.trim()
            if (name.isEmpty()) {
                binding.editTextName.error = "No name"
                return@setOnClickListener
            }
            binding.textViewMessage.text = "Hello $name"
        }

        binding.buttonGoodbye.setOnClickListener {
            val name = binding.editTextName.text.trim()
            if (name.isEmpty()) {
                binding.editTextName.error = "No name"
                return@setOnClickListener
            }
            binding.textViewMessage.text = "Goodbye $name"
        }
    }
}