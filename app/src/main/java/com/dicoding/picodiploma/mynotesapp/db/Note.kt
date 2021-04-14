package com.dicoding.picodiploma.mynotesapp.db

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Note(
    var id: Int = 0,
    var title: String = "",
    var description: String = "",
    var date: String? = ""
) : Parcelable
