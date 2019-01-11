package com.example.lrodriguezbarroncas.ejemplosmasterdetails

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ejemplo_master_details.*
import android.widget.Toast



class EjemploMasterDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejemplo_master_details)


        val mensa :Toast

        if ( Horizontal!= null) {

            mensa = Toast.makeText(applicationContext, "Horizontal", Toast.LENGTH_SHORT)
            mensa.show()
        }else{
            mensa=Toast.makeText(applicationContext, "Vertical", Toast.LENGTH_SHORT)
            mensa.show()
        }


    }




}
