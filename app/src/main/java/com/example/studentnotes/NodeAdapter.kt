package com.example.studentnotes

import android.content.ClipData.Item
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.studentnotes.data.Note


class NodeAdapter(private val notes: List<Note>) :
    RecyclerView.Adapter<NodeAdapter.NoteViewHolder>() {

        inner class NoteViewHolder(val binding: Item) :
        recyclerview.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NodeAdapter.NoteViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: NodeAdapter.NoteViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}) {
}