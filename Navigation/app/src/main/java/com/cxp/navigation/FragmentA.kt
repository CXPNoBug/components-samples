package com.cxp.navigation

import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.navigation.Navigation
import com.cxp.navigation.databinding.FragmentABinding

class FragmentA : Fragment() {
    private var _binding: FragmentABinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentABinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.btnFragmentA.setOnClickListener {

            val navController = Navigation.findNavController(it)
            //普通方式传参 - 不推荐
            val bundle = Bundle()
            bundle.putString("name", "CXP")
            navController.navigate(R.id.action_fragmentA_to_fragmentB, bundle)

            //通过safeArgs传递参数 推荐
            val navDestination = FragmentADirections.actionFragmentAToFragmentB("Cheng")
            navController.navigate(navDestination)
        }

        binding.btnDeepLink.setOnClickListener {
            //显示深度链接
            val notificationManager = NotificationManagerCompat.from(requireContext())
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val importance = NotificationManager.IMPORTANCE_DEFAULT
                val channel =
                    NotificationChannel("1", "CXP", importance)
                channel.description = "deeplink"
                notificationManager.createNotificationChannel(channel)
            }

            val navController = Navigation.findNavController(it)
            val deepLinkBuilder = navController.createDeepLink()
            val bundle = Bundle()
            bundle.putString("name", "deepLink")
            val pendingIntent = deepLinkBuilder
                //传入graph资源文件
                .setGraph(R.navigation.navigation)
                //传入参数
                .setArguments(bundle)
                //传入需要通过深度链接打开的目标页面
                .setDestination(R.id.deepLinkFragment)
                .createPendingIntent()
            val builder = NotificationCompat.Builder(requireContext(), "1")
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setContentTitle("测试deepLink")
                .setContentText("哈哈哈")
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            notificationManager.notify(1, builder.build())
        }
        binding.webview.run {
            loadUrl("file:///android_asset/index.html")
            webChromeClient= WebChromeClient()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}