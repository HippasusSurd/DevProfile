package com.example.joelcollins.devprofile

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.graphics.drawable.RoundedBitmapDrawable
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*
import java.math.RoundingMode

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val logoBitmap = BitmapFactory.decodeResource(resources, R.drawable.devslopesprofilelogo)
        val logoRounded = RoundedBitmapDrawableFactory.create(resources, logoBitmap)
        logoRounded.cornerRadius = 20f
        logo.setImageDrawable(logoRounded)

    }
}

