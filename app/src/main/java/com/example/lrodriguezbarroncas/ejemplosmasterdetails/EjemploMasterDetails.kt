package com.example.lrodriguezbarroncas.ejemplosmasterdetails

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ejemplo_master_details.*
import android.widget.Toast
import org.jetbrains.anko.*


class EjemploMasterDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejemplo_master_details)

        //Toast para mandar mensaje dentro de cada opción
        val mensa :Toast

        //If para saber en que layout esta
        if ( Horizontal!= null) {
        //Mensaje para saber que lo detecto
            mensa = Toast.makeText(applicationContext, "Horizontal", Toast.LENGTH_SHORT)
            mensa.show()
        }else{
            mensa=Toast.makeText(applicationContext, "Vertical", Toast.LENGTH_SHORT)
            mensa.show()
        }
        val num=5
        val intent = Intent(this, OtraActivity::class.java).apply {

        putExtra("id",   num)



        }

        button.setOnClickListener {
            //Pagina web
            //browse("https://github.com/Luisfrb56/EjemplosMasterDetails")
            //Otra actividad
            startActivity(intent)
        }
    }





}
