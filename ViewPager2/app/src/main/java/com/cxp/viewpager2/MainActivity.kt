package com.cxp.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.cxp.viewpager2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val datas = listOf(1, 2, 3)

    private lateinit var adapter: PagerAdapter

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = PagerAdapter(datas)

        binding.viewPager.let {
            //竖向滑动 默认 横向滑动
//            it.orientation= ViewPager2.ORIENTATION_VERTICAL
            it.adapter = adapter

            //页面滑动事件监听
            it.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    Toast.makeText(this@MainActivity, "page selected $position", Toast.LENGTH_SHORT)
                        .show()
                }
            })

            //禁止滑动
//            it.isUserInputEnabled = false

            val compositePageTransformer = CompositePageTransformer()
            compositePageTransformer.addTransformer(ScaleInTransformer())
            compositePageTransformer.addTransformer(
                MarginPageTransformer(
                    resources.getDimension(R.dimen.dp_10).toInt()
                )
            )
            it.setPageTransformer(compositePageTransformer)

            //设置padding (一屏多页)
            val recyclerView = it.getChildAt(0) as RecyclerView
            recyclerView.run {
                val padding = resources.getDimensionPixelOffset(R.dimen.dp_20)
                setPadding(padding, 0, padding, 0)
                clipToPadding = false
            }
        }

        binding.btnPre.setOnClickListener { preFakeDragBy() }
        binding.btnNext.setOnClickListener { nextFakeDragBy() }
    }

    /**
     * 拖拽 正数 向前拖拽
     */
    private fun preFakeDragBy() {
        binding.viewPager.run {
            beginFakeDrag()
            if (fakeDragBy(1000f))
                endFakeDrag()
        }
    }

    /**
     * 拖拽 负数 向后拖拽
     */
    private fun nextFakeDragBy() {
        binding.viewPager.run {
            beginFakeDrag()
            if (fakeDragBy(-1000f))
                endFakeDrag()
        }
    }
}