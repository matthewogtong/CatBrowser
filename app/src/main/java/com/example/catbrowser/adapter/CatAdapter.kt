package com.example.catbrowser.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.catbrowser.databinding.ItemImageBinding
import com.example.catbrowser.model.Breed

class CatAdapter : RecyclerView.Adapter<CatAdapter.CatViewHolder>() {
    private val urls = mutableListOf<Breed>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatAdapter.CatViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        holder.loadUrl(urls[position])
    }

    override fun getItemCount(): Int {
        return urls.size
    }

    fun updateUrls(urls: List<Breed>) {
        val size = this.urls.size
        this.urls.clear()
        notifyItemRangeRemoved(0, size)

        this.urls.addAll(urls)
        notifyItemRangeInserted(0, urls.size)
    }

    class CatViewHolder(
        private val binding: ItemImageBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun loadUrl(url: Breed) = with(binding) {
            ivImage.loadUrl(url)
            tvUrl.text = url
        }

        companion object {

            fun getInstance(parent: ViewGroup): CatViewHolder {
                val binding = ItemImageBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )

                return getInstance(binding)
            }
        }
    }
}