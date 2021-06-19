package com.example.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rvcontact=findViewById<RecyclerView>(R.id.rvcontact)

        var contactList= listOf(
            Contact("Jane","074356745","khavvn@gmail.com"),
            Contact("laura","0734567843","laura@gmail.com"),
            Contact("Otieno","0745367237","totos@gmail.com"),
            Contact("Jane","074356745","khavvn@gmail.com"),
            Contact("laura","0734567843","laura@gmail.com"),
            Contact("Otieno","0745367237","totos@gmail.com"),
            Contact("melvin","0745367237","melvin@gmail.com"),
            Contact("Jessicca","074356745","khavvn@gmail.com"),
            Contact("valary","0734567843","val@gmail.com"),
            Contact("Eglah","0745367237","eglah@gmail.com"),




            )
        var contactAdapter=ContactAdapter(contactList)
         rvcontact.layoutManager= LinearLayoutManager(baseContext)
         rvcontact.adapter=contactAdapter

    }
}

