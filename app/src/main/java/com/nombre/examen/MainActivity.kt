package com.nombre.examen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val listView: ListView = findViewById(R.id.lista);
        val colores = listOf("rojo", "verde", "azul")
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, colores)
        listView.adapter = arrayAdapter
    }



}