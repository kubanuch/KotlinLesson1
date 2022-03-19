package com.example.kotlinlesson1.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinlesson1.databinding.ItemNameBinding
import com.example.kotlinlesson1.models.NameModel

class NamesAdapter(
    val onItemClickListener: (model: NameModel) -> Unit,
) : RecyclerView.Adapter<NamesAdapter.BooksViewHolder>() {
    private var list: List<NameModel> = arrayListOf()


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): NamesAdapter.BooksViewHolder {
        return BooksViewHolder(
            ItemNameBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: NamesAdapter.BooksViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    fun setList(list: List<NameModel>) {
        this.list = list
    }


    override fun getItemCount(): Int {
        return list.size
    }

    inner class BooksViewHolder(private val binding: ItemNameBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(nameModel: NameModel) {
            binding.tvText.text = nameModel.title

            binding.imageView.setImageResource(nameModel.image)
            binding.root.setOnClickListener {
                onItemClickListener(nameModel)
            }
        }
    }
}