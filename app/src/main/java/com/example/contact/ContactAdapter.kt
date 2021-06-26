package com.example.contact

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactAdapter(var contactList: List<Contact>,var context:Context):RecyclerView.Adapter<ContactViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactViewHolder(itemView)


    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        holder.tvname.text=currentContact.name
        holder.tvphonenumber.text=currentContact.phonenumber
        holder.tvemail.text=currentContact.Email
        Picasso.get().load(currentContact.imageUrl)
            .placeholder(R.drawable.person)
            .into(holder.imgcontact)

        holder.cvcontact.setOnClickListener(){
            var intent= Intent(context,view_activity::class.java)


            intent.putExtra("name",currentContact.name)
            intent.putExtra("phone",currentContact.phonenumber)
            intent.putExtra("email",currentContact.Email)
            intent.putExtra("image",currentContact.imageUrl)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)

        }


    }

    override fun getItemCount(): Int {
        return contactList.size



    }}
class ContactViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvname=itemView.findViewById<TextView>(R.id.tvname)
    var tvphonenumber=itemView.findViewById<TextView>(R.id.tvphone)
    var tvemail=itemView.findViewById<TextView>(R.id.tvemail)
    var imgcontact=itemView.findViewById<ImageView>(R.id.imgcontact)
    var cvcontact=itemView.findViewById<CardView>(R.id.cvcontact)

}

