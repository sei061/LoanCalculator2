package com.example.loancalculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AutoCompleteTextView
import android.widget.EditText

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AnnuitetFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AnnuitetFragment : Fragment(R.layout.fragment_annuitet) {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    fun setOnClickListener(function: () -> Int) {

    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AnnuitetFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AnnuitetFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }


    private fun <T> findViewById(textViewLoan: Int) {
        val annuitetLoan = findViewById<EditText>(R.id.textViewLoan)
        val annuitetInterest = findViewById<EditText>(R.id.textViewInterest)
        val annuitetPeriod = findViewById<EditText>(R.id.textViewInstallments)

        //create a variable that takes the value of the textViewLoan and convert it to a double
        val loan = annuitetLoan.text.toString().toDouble()
        //create a variable that takes the value of the textViewInterest and convert it to a double
        val interest = annuitetInterest.text.toString().toDouble()
        //create a variable that takes the value of the textViewInstallments and convert it to a double
        val period = annuitetPeriod.text.toString().toDouble()
        
    }

    

    }










    //

