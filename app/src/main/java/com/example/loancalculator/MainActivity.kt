package com.example.loancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = AnnuitetFragment()
        val secondFragment = SerieFragment()
        val thirdFragment = InstillingsFragment()
        val button = findViewById<Button>(R.id.btnFragment1)
        val button2 = findViewById<Button>(R.id.btnFragment2)
        val button3 = findViewById<Button>(R.id.btnFragment3)

        //replace the content of the frame layout with either the first or the second fragment using a fragment transaction
        supportFragmentManager.beginTransaction()
            .replace(R.id.flFragment, firstFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()

        button.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.flFragment, firstFragment)
                .addToBackStack(null)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit()
        }

        button2.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.flFragment, secondFragment)
                .addToBackStack(null)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit()
        }

        button3.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.flFragment, thirdFragment)
                .addToBackStack(null)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit()
        }



        }

        }


