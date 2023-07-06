package com.floresrodriguez.cuponex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.concurrent.thread

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Thread.sleep(2000)
        val intent= Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}