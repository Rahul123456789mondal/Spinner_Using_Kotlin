package com.example.spinner_using_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spinner: Spinner = findViewById(R.id.dropdown)
        val textView: TextView = findViewById(R.id.heading)
        // Initialize the String Array
        val color = arrayOf("Red", "Green", "Blue", "Perpale", "Pink", "Magenda", "Gray")
        //Initialize the Array Adapter
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, color)
        // Set the Drop Down View Resourese
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        // Apply the Adapter To the spinner
        spinner.adapter = adapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, Id: Long) {
                //textView.text = "Selected Item is : ${parent?.getItemAtPosition(position).toString()}"
                textView.text =  "Selected Item is : ${color.get(position)} "
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                textView.text = " please select an option"
            }

        }

    }
}












































