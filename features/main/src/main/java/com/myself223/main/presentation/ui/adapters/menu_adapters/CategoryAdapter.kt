package com.myself223.main.presentation.ui.adapters.menu_adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.myself223.geeksdelivery.presentation.model.CategoryUi
import com.myself223.main.databinding.ItemCategoryBinding

class CategoryAdapter(private val click: (String) -> Unit) :
    ListAdapter<CategoryUi, CategoryAdapter.CategoryViewHolder>(CategoryDiffutil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            ItemCategoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val model = getItem(position)
        holder.onBind(model)
        holder.itemView.setOnClickListener {
            model?.name?.let { name -> click(name) }
        }
    }

    inner class CategoryViewHolder(private val binding: ItemCategoryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(item: CategoryUi) {
            binding.itemNameCategory.text = item.name
        }
    }
}

class CategoryDiffutil : DiffUtil.ItemCallback<CategoryUi>() {
    override fun areItemsTheSame(oldItem: CategoryUi, newItem: CategoryUi): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: CategoryUi, newItem: CategoryUi): Boolean {
        return oldItem == newItem
    }
}
