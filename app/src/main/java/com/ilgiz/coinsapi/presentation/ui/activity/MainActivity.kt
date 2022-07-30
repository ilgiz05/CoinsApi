package com.ilgiz.coinsapi.presentation.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.example.entypoints.R
import com.ilgiz.coinsapi.presentation.ui.dialog.LoadingDialog
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    val time:Long = 5000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupNavigation()
        loading()
    }

    private fun setupNavigation() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_con) as NavHostFragment
        val navController = navHostFragment.navController
    }

    private fun loading() {
        val loading = LoadingDialog(this)
        loading.startLoading()
        val handler = android.os.Handler()
        handler.postDelayed(object : Runnable {
            override fun run() {
                loading.isDismiss()
            }
        }, time)
    }
}