package com.vyakunin

import android.content.Context
import android.os.Build
import android.support.annotation.RequiresApi
import android.support.design.widget.TextInputEditText
import android.util.AttributeSet
import android.view.View

class TextInputEditTextNoAutofill : TextInputEditText {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    @RequiresApi(Build.VERSION_CODES.O)
    override fun getAutofillType(): Int {
        return View.AUTOFILL_TYPE_NONE
    }
}