package com.cxp.viewpager2

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cxp.viewpager2.databinding.ItemPagerBinding

/**
 * <pre>
 *     author : CXP
 *     e-mail : cxpnobug@gmail.com
 *     time   : 2021/01/03
 *     desc   : Pager 适配器
 *     version: 1.0
 * </pre>
 */
class PagerAdapter(private val list: List<Int>) :
    RecyclerView.Adapter<PagerAdapter.PagerViewHolder>() {

    inner class PagerViewHolder(val binding: ItemPagerBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder {
        val binding = ItemPagerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PagerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {

        val colors = arrayOf("#CCFF99", "#41F1E5", "#8D41F1", "#FF99CC")

        holder.binding.tvText.text = list[position].toString()
        holder.binding.tvText.setBackgroundColor(Color.parseColor(colors[position]))
    }

    override fun getItemCount() = list.size
}