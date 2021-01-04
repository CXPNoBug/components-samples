object Versions {

    const val activity = "1.1.0"
    const val android_gradle_plugin = "4.1.1"
    const val appcompat = "1.2.0"
    const val cardview = "1.0.0"
    const val constraint_layout = "2.0.4"
    const val core_ktx = "1.1.0"
    const val multidex = "2.0.0"
    const val coroutines = "1.4.1"
    const val espresso = "3.2.0"
    const val fragment = "1.2.1"
    const val glide = "4.11.0"
    const val junit = "4.13.1"
    const val kotlin = "1.4.21"
    const val lifecycle = "2.2.0"
    const val material = "1.2.1"
    const val recyclerview = "1.1.0"
    const val viewpager2 = "1.0.0"
    const val retrofit = "2.9.0"
    const val room = "2.2.5"
    const val eventbus = "3.2.0"
    const val permissionx = "1.4.0"
    const val refresh = "2.0.2"
    const val immersionbar = "3.0.0"
    const val gsy_video_player = "8.0.0"
    const val banner = "3.4.0"
    const val leakcanary = "2.6"
    const val sonic = "3.1.0"
    const val tbs = "43939"
    const val bugly_crashreport = "3.3.3"
    const val bugly_nativecrashreport = "3.7.7"
    const val mmkv = "1.2.6"
}

object Deps {
    const val activity_ktx = "androidx.activity:activity-ktx:${Versions.appcompat}"

    const val android_gradle_plugin =
        "com.android.tools.build:gradle:${Versions.android_gradle_plugin}"

    const val junit = "junit:junit:${Versions.junit}"
    const val app_compat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val cardview = "androidx.cardview:cardview:${Versions.cardview}"
    const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    const val viewpager2 = "androidx.viewpager2:viewpager2:${Versions.viewpager2}"
    const val constraint_layout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"
    const val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"
    const val multidex = "androidx.multidex:multidex:${Versions.multidex}"

    const val banner_view_pager = "org.greenrobot:eventbus:${Versions.banner}"
    const val eventbus = "org.greenrobot:eventbus:${Versions.eventbus}"
    const val permissionx = "com.permissionx.guolindev:permissionx:${Versions.permissionx}"
    const val gsy_video_player = "com.shuyu:GSYVideoPlayer:${Versions.gsy_video_player}"
    const val leakcanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakcanary}"


    const val tencent_sonic = "com.tencent.sonic:sdk:${Versions.sonic}"
    const val tencent_tbs = "com.tencent.tbs.tbssdk:sdk:${Versions.tbs}"

    const val coroutines_core =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutines_android =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

    const val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val espresso_contrib = "androidx.test.espresso:espresso-contrib:${Versions.espresso}"
    const val espresso_intents = "androidx.test.espresso:espresso-intents:${Versions.espresso}"

    const val fragment_runtime = "androidx.fragment:fragment:${Versions.fragment}"
    const val fragment_runtime_ktx = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    const val fragment_testing = "androidx.fragment:fragment-testing:${Versions.fragment}"

    const val refresh_refresh = "com.scwang.smart:refresh-layout-kernel:${Versions.refresh}"
    const val refresh_refresh_header =
        "com.scwang.smart:refresh-header-material:${Versions.refresh}"

    const val immersionbar_immersionbar =
        "com.gyf.immersionbar:immersionbar:${Versions.immersionbar}"
    const val immersionbar_immersionbar_ktx =
        "com.gyf.immersionbar:immersionbar-ktx:${Versions.immersionbar}"

    const val glide_runtime = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glide_compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"

    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    const val lifecycle_runtime_ktx =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val lifecycle_viewmodel_ktx =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifecycle_livedata_ktx =
        "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"

    const val retrofit_runtime = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofit_gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val retrofit_scalars = "com.squareup.retrofit2:converter-scalars:${Versions.retrofit}"

    const val room_runtime = "androidx.room:room-runtime:${Versions.room}"
    const val room_compiler = "androidx.room:room-compiler:${Versions.room}"
    const val room_ktx = "androidx.room:room-ktx:${Versions.room}"

    const val bugly_crashreport = "com.tencent.bugly:crashreport:${Versions.bugly_crashreport}"
    const val bugly_nativecrashreport = "com.tencent.bugly:nativecrashreport:${Versions.bugly_nativecrashreport}"

    const val mmkv = "com.tencent:mmkv-static:${Versions.mmkv}"

}