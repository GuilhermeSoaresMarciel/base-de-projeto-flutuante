package com.dbm

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.graphics.PixelFormat
import android.view.Gravity
import android.view.WindowManager
import android.widget.LinearLayout

class Menu {

    private lateinit var main: LinearLayout

    private val params = WindowManager.LayoutParams(
        WindowManager.LayoutParams.WRAP_CONTENT,
        WindowManager.LayoutParams.WRAP_CONTENT,
        WindowManager.LayoutParams.TYPE_APPLICATION,
        WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
        PixelFormat.TRANSLUCENT
    )

    fun show(context: Context) {
        main = LinearLayout(context)

        val ct = LinearLayout(context)

        ct.layoutParams = LinearLayout.LayoutParams(
            100,
            100
        )

        ct.setBackgroundColor(Color.RED)

        main.addView(ct)

        params.gravity = Gravity.CENTER

        val windowManager = (context as Activity).windowManager
        windowManager.addView(main, params)
    }
}