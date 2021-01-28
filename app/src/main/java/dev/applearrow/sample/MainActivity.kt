package dev.applearrow.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.applearrow.sample.databinding.ActivityMainBinding
import timber.log.Timber

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    override fun onStart() {
        super.onStart()
        Timber.d("Hello world")
        binding.textView.text = "Hello world"
    }
}