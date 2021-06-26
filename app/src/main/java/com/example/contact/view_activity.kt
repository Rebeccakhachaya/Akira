package com.example.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class view_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)
        var nameIntent=intent.getStringExtra("name")
        var phoneIntent=intent.getStringExtra("phone")
        var emailIntent=intent.getStringExtra("email")
        var imageIntent=intent.getStringExtra("image")

        var name=findViewById<TextView>(R.id.tvName)
        var phone=findViewById<TextView>(R.id.tvphones)
        var email=findViewById<TextView>(R.id.tvEmail)
        var image= findViewById<ImageView>(R.id.imgperson)


        name.text=nameIntent
        phone.text=phoneIntent
        email.text=emailIntent
        Picasso.get().load(imageIntent).into(image)




    }
}