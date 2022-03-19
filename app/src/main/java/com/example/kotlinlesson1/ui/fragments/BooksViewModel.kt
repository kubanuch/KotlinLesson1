package com.example.kotlinlesson1.ui.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlinlesson1.data.local.Server
import com.example.kotlinlesson1.models.NameModel

class BooksViewModel : ViewModel() {
    val description = MutableLiveData<String>()

    fun getBooks(): List<NameModel> {
        return Server.getBooks()
    }

    fun putDescription(text: String) {
        description.value = text
    }

}