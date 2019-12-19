package com.e.livedata

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel = ViewModelProviders.of(this).get(MainViewModel ::class.java)
        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        button.setOnClickListener {
            viewModel.getValue()
        }
        viewModel.observeText.observe(this, Observer {
            textView.text = it
        })
    }
}
