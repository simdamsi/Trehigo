package com.simdamsi.trehigo.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_user")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,

    var name: String,
    var phone: String,
    var image: String?
)