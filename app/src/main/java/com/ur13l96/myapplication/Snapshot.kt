package com.ur13l96.myapplication

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Snapshot(
    var id: String = "",
    var title: String,
    var imageURL: String = "",
    var likeList: Map<String, Boolean> = mutableMapOf()
)
