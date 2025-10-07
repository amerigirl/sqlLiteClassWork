package com.example.studentnotes.data

import androidx.room.Entity

@Entity(tableName = "notes")
data class Note(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,)
    val title: String,
    val description: String,
    val timestamp: Long = System.currentTimeMillis()
)
