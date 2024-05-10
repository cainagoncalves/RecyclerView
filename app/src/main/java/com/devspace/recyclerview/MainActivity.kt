package com.devspace.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        //Criar data class
        //Create list from data class type
        //Create adapter
        //Set Adapter
        //Linear Layout manager

        val rvList = findViewById<RecyclerView>(R.id.rv_list)
    }
}

private val contacts = listOf(
    Contact(
        name = "Cainã",
        phone = "(55) 21 96754-5629",
        icon = R.drawable.sample9
    ),
    Contact(
        name = "Fernanda",
        phone = "(55) 21 96754-5658",
        icon = R.drawable.sample11
    ),
    Contact(
        name = "Briana",
        phone = "(55) 21 96785-4785",
        icon = R.drawable.sample3
    ),
    Contact(
        name = "Joe",
        phone = "(55) 21 93456-7890",
        icon = R.drawable.sample8
    ),
    Contact(
        name = "Camila",
        phone = "(55) 21 94567-8901",
        icon = R.drawable.sample4
    ),
    Contact(
        name = "Cauã",
        phone = "(55) 21 95678-9012",
        icon = R.drawable.sample2
    ),
    Contact(
        name = "Cayla",
        phone = "(55) 21 96789-0123",
        icon = R.drawable.sample6
    ),
    Contact(
        name = "Mãe",
        phone = "(55) 21 97890-1234",
        icon = R.drawable.sample13
    ),
    Contact(
        name = "Emily",
        phone = "(55) 21 98901-2345",
        icon = R.drawable.sample15
    )

)