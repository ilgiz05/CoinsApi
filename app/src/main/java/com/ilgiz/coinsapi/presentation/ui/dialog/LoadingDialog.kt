package com.ilgiz.coinsapi.presentation.ui.dialog

import android.app.Activity
import android.app.AlertDialog
import com.example.entypoints.R

class LoadingDialog(val mainActivity: Activity) {

    private lateinit var isdialog: AlertDialog

    fun startLoading() {
        val inflater = mainActivity.layoutInflater
        val dialogView = inflater.inflate(R.layout.progress_bar, null)
        val builder = AlertDialog.Builder(mainActivity)
        builder.setView(dialogView)
        builder.setCancelable(false)
        isdialog = builder.create()
        isdialog.show()
    }

    fun isDismiss() {
        isdialog.dismiss()
    }
}