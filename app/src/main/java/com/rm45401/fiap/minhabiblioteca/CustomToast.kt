package com.rm45401.fiap.minhabiblioteca

import android.content.Context
import android.view.LayoutInflater
import android.widget.Toast
import android.view.Gravity
import android.widget.TextView
import android.content.Context.LAYOUT_INFLATER_SERVICE
import android.content.Context.LAYOUT_INFLATER_SERVICE
import org.w3c.dom.Text


/**
 * Created by logonrm on 26/03/2018.
 */

class CustomToast() {
    public fun showToast(context: Context, mensagem: String) {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val customToastRoot = inflater.inflate(R.layout.custom_toast, null)

        val customToast = Toast(context)

        customToast.view = customToastRoot
        val tv = customToastRoot.findViewById<TextView>(R.id.tv1)
        tv.text = mensagem
        customToast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM, 0, 0)
        customToast.duration = Toast.LENGTH_LONG
        customToast.show()
    }
}