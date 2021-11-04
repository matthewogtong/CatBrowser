package com.example.catbrowser.adapter

import android.R.attr
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.catbrowser.databinding.ItemImageBinding
import com.example.catbrowser.extensions.loadUrl
import com.example.catbrowser.model.Breed
import androidx.core.content.ContextCompat.startActivity
import android.content.Intent
import android.util.Log
import com.example.catbrowser.view.DetailActivity


class CatAdapter : RecyclerView.Adapter<CatAdapter.CatViewHolder>() {
    private val breeds = mutableListOf<Breed>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        return CatViewHolder.getInstance(parent)
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        holder.loadInfo(breeds[position])
    }

    override fun getItemCount(): Int {
        return breeds.size
    }

    fun updateBreeds(breeds: List<Breed>) {
        val size = this.breeds.size
        this.breeds.clear()
        notifyItemRangeRemoved(0, size)

        this.breeds.addAll(breeds)
        notifyItemRangeInserted(0, breeds.size)
    }

    class CatViewHolder(
        private val binding: ItemImageBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun loadInfo(breed: Breed) = with(binding) {
            breed?.image?.url?.let { ivImage.loadUrl(it) }
            tvCatName.text = breed.name
            ivImage.setOnClickListener{
                Log.d("give me name", tvCatName.text.toString())
                val intent = Intent(it.context, DetailActivity::class.java)
                intent.putExtra("CAT_IMAGE", breed.image?.url)
                intent.putExtra("CAT_DESCRIPTION", breed.description)
                startActivity(it.context, intent, null)
            }
        }

        companion object {

            fun getInstance(parent: ViewGroup): CatViewHolder {
                val binding = ItemImageBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )

                return CatViewHolder(binding)
            }
        }
    }
}