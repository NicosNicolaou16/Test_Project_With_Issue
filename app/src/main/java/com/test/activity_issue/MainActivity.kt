package com.test.activity_issue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.activity_issue.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit  var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.hello
    }
}