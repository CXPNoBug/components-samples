package com.cxp.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import androidx.navigation.Navigation
import com.cxp.navigation.databinding.FragmentBBinding


class FragmentB : Fragment() {

    private var _binding: FragmentBBinding? = null
    private val binding get() = _binding!!

    private var name: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            //普通参数接收方式
//            name = it.getString("name")

            //通过safeArgs接收参数
            name= FragmentBArgs.fromBundle(it).name
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        binding.fragmentbTv.text=name?:"default"

        binding.btnFragmentB.setOnClickListener {
           Navigation.findNavController(it).navigate(R.id.action_fragmentB_to_fragmentC)
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}