package com.cxp.navigation

import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cxp.navigation.databinding.FragmentDeepLinkBinding


class DeepLinkFragment : Fragment() {

    private var _binding: FragmentDeepLinkBinding? = null
    private val binding get() = _binding!!

    private var name: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            name = it.getString("name")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDeepLinkBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val data: Uri? = activity?.intent?.data
        data?.run {
            Log.d(
                "CXP_LOG",
                "host = $host,\npath = $path,\nquery = $query,\nparam = ${getQueryParameter("name")}"
            )
            when (path) {
                "/1" -> name = "DeepLinkFragmentA"
                "/2" -> name = "DeepLinkFragmentB"
                "/3" -> name = "DeepLinkFragmentC"
            }
        }

        binding.fragmentDeepLkinkTv.text = name ?: "DeepLinkFragmentA"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}