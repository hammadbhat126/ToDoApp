package com.kashsoft.todoapp

import java.util.*


object DataObject {
    var listdata = mutableListOf<CardInfo>()

    fun setData(title: String,priority:String){
        listdata.add(CardInfo(title,priority))
    }

}