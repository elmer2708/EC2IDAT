package com.floresrodriguez.cuponex

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.floresrodriguez.cuponex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabAddCoupon.setOnClickListener {
            val intent = Intent(this, AddCouponActivity::class.java)
            startActivity(intent)
        }
    }
}
