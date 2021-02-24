package com.cxp.scopedstoragesample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.cxp.scopedstoragesample.databinding.AlbumImageItemBinding

/**
 * <pre>
 *     author : ChengPeng
 *     e-mail : cxpnobug@gmail.com
 *     time   : 2021/02/24
 *     desc   : 相册适配器
 *     version: 1.0
 * </pre>
 */
class AlbumAdapter(
    private val context: Context,
    private val imageList: List<Image>,
    private val checkedImages: MutableMap<String, Image>,
    private val imageSize: Int,
    private val pickFiles: Boolean
) : RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder>() {

    inner class AlbumViewHolder(val binding: AlbumImageItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun getItemCount() = imageList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val binding =
            AlbumImageItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val holder = AlbumViewHolder(binding)
        if (pickFiles) {
            holder.itemView.setOnClickListener {
                val position = holder.adapterPosition
                val image = imageList[position]
                image.checked = !image.checked
                if (image.checked) {
                    checkedImages[image.uri.toString()] = image
                } else {
                    checkedImages.remove(image.uri.toString())
                }
                notifyItemChanged(position)
            }
        }
        return holder
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        holder.binding.imageView.layoutParams.width = imageSize
        holder.binding.imageView.layoutParams.height = imageSize
        val image = imageList[position]
        if (image.checked) {
            holder.binding.checkedView.visibility = View.VISIBLE
        } else {
            holder.binding.checkedView.visibility = View.INVISIBLE
        }
        Glide.with(context).load(image.uri).apply {
            RequestOptions().placeholder(R.drawable.album_loading_bg)
                .override(imageSize, imageSize)
        }.into(holder.binding.imageView)
    }


}