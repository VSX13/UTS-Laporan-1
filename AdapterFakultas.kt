package com.example.profilfakultas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list.view.*

class AdapterFakultas(val itemFakultas: List<DataFakultas>, val clickListener: (DataFakultas) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder) .bind(itemFakultas[position], clickListener)
    }

    override fun getItemCount() = itemFakultas.size
    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(data: DataFakultas,clickListener: (DataFakultas) -> Unit) {
            itemView.logo.setImageResource(data.logoFakultas)
            itemView.list_fakultas.text = data.namaFakultas
            itemView.setOnClickListener { clickListener(data) }
        }
    }
}
