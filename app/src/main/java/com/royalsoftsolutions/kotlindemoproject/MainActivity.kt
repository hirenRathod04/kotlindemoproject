package com.royalsoftsolutions.kotlindemoproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.royalsoftsolutions.kotlindemoproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var context = this@MainActivity
    lateinit var binding: ActivityMainBinding
    private var userName : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
        addListener()
    }

    private fun init() {

    }

    private fun addListener() {
        binding.btnReset.setOnClickListener(this)
        binding.btnSubmit.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            binding.btnReset -> {
                binding.etUserName.setText("")
                binding.etPassword.setText("")
            }
            binding.btnSubmit -> {
                userName = binding.etUserName.text.toString()
                Toast.makeText(context, userName, Toast.LENGTH_LONG).show()
            }
        }
    }
}