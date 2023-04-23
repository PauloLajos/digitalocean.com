package com.android.developer.androidanimationexample

import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.android.developer.androidanimationexample.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var animFadeIn: Animation? = null
    var animFadeOut: Animation? = null
    var animBlink: Animation? = null
    var animZoomIn: Animation? = null
    var animZoomOut: Animation? = null
    var animRotate: Animation? = null
    var animMove: Animation? = null
    var animSlideUp: Animation? = null
    var animSlideDown: Animation? = null
    var animBounce: Animation? = null
    var animSequential: Animation? = null
    var animTogether: Animation? = null
    var animCrossFadeIn: Animation? = null
    var animCrossFadeOut: Animation? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //setContentView(R.layout.activity_main)

        // fade in
        animFadeIn = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.fade_in);
        binding.btnFadeIn.setOnClickListener {
            binding.txtFadeIn.visibility = View.VISIBLE;
            binding.txtFadeIn.startAnimation(animFadeIn);
        }
    }
}