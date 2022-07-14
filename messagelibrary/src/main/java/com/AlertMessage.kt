package com

import android.app.AlertDialog
import android.content.Context

object AlertMessage {

    fun showMessage(context: Context, title: String, message: String, onPositiveButtonCallback:()->Unit){

        AlertDialog.Builder(context)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("Close"){
                dialog, which -> onPositiveButtonCallback.invoke()
            }
            .show()

    }

}