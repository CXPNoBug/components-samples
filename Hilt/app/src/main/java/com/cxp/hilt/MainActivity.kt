package com.cxp.hilt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.cxp.hilt.databinding.ActivityMainBinding
import com.cxp.hilt.retrofit.ApiService
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var truck: Truck

    @Inject
    lateinit var retrofit: Retrofit

    private val viewModel: MyViewModel by lazy { ViewModelProvider(this).get(MyViewModel::class.java) }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.truckDeliverBtn.setOnClickListener {
            truck.deliver()
        }
        binding.networkRequestBtn.setOnClickListener {
            val apiService = retrofit.create(ApiService::class.java)
            lifecycleScope.launch(Dispatchers.IO) {
                val provinces = apiService.getProvinces()
                for (province in provinces) {
                    println(province.name)
                }
            }
        }
        binding.viewModelWorkBtn.setOnClickListener {
            viewModel.doWork()
        }

    }
}