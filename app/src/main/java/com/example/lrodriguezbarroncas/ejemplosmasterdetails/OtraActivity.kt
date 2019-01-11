package com.example.lrodriguezbarroncas.ejemplosmasterdetails

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ejemplo_master_details.*
import android.widget.Toast
import org.jetbrains.anko.*
import android.content.Intent
import kotlinx.android.synthetic.main.activity_otra.*

class OtraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otra)

        val bundle=intent.extras
        val nombre=bundle.get("id")
        Hola.setText(nombre.toString())

    }
}
