package com.example.colormyviews

import android.graphics.Color
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
            setListener()
    }
    private fun setListener(){
        binding.apply {
            val clickAble: List<View> = listOf(boxOneText,boxTwoText,boxThreeText,boxFourText,boxFiveText)
            for (i in clickAble){
                i.setOnClickListener(View.OnClickListener {
                    changeColor(it)
                })
            }
        }
    }
    private fun changeColor(view: View)
    {
        binding.apply {
            when (view) {
                boxOneText-> view.setBackgroundColor(Color.DKGRAY)
                boxTwoText->view.setBackgroundColor(Color.BLUE)
                boxThreeText->view.setBackgroundColor(Color.GREEN)
                boxFourText->view.setBackgroundColor(Color.MAGENTA)
                boxFiveText-> view.setBackgroundColor(Color.YELLOW)
            }
        }
    }
}