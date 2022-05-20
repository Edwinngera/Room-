package com.example.room

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.RecyclerView
import java.text.FieldPosition

class UserListAdapter:RecyclerView.Adapter<MyViewHolder>() {

    var userList= mutableListOf<User>()

    var clickListener:ListClickListener<Users>?=null



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {


        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}

class MyViewHolder(view: View):RecyclerView.ViewHolder(view)
{

    val username = view.findViewById<TextView>(R.id.text_username)
    val location = view.findViewById<TextView>(R.id.text_location)
    val email = view.findViewById<TextView>(R.id.text_email)
    val layout = view.findViewById<ConstraintSet.Layout>()
    val imgDelete = view.findViewById<TextView>(R.id.imgDelete)

}





interface ListClickListener<T>
{
    fun onClick(data:T,position: Int)
    fun onDelete(user:T)
}