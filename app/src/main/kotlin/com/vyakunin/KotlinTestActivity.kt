package com.vyakunin

import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.vyakunin.kotlintests.R
import kotlinx.android.synthetic.main.activity_kotlin_test.*


class KotlinTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_test)
        label.text = "Enable autofill -> long press on each input field to trigger 'autofill' popup -> select autofill -> fails on TextInputEditText"
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            disableAutoFill()
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun disableAutoFill() {
        window.decorView.importantForAutofill = View.IMPORTANT_FOR_AUTOFILL_NO_EXCLUDE_DESCENDANTS
    }
}