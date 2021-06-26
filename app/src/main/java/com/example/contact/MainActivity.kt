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
            Contact("jane","07345628","jane@gmail.com","https://cutt.ly/1mw4Z6L"),
            Contact("mercy","07345628","mercy@gmail.com","https://cutt.ly/Mmw7txp"),
            Contact("joy","07345628","joy@gmail.com","https://cutt.ly/jmw7xLI"),
            Contact("loyce","07345628","loyce@gmail.com","https://cutt.ly/Nmw7UwB"),
            Contact("Brian","07345628","brian@gmail.com","https://cutt.ly/vmw7HZE"),
            Contact("jane","07345628","jane@gmail.com","https://cutt.ly/5mw7N9F"),
            Contact("jane","07345628","jane@gmail.com","https://cutt.ly/1mw4Z6L"),
            Contact("jane","07345628","jane@gmail.com","https://cutt.ly/1mw4Z6L"),





            )
        var contactAdapter=ContactAdapter(contactList,baseContext)
         rvcontact.layoutManager= LinearLayoutManager(baseContext)
           rvcontact.adapter=contactAdapter


    }
}

