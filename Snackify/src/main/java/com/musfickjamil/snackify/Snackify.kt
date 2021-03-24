package com.musfickjamil.snackify

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import com.google.android.material.snackbar.Snackbar
import com.musfickjamil.snackify.databinding.LayoutAlertDangerBinding
import com.musfickjamil.snackify.databinding.LayoutAlertInfoBinding
import com.musfickjamil.snackify.databinding.LayoutAlertSuccessBinding
import com.musfickjamil.snackify.databinding.LayoutAlertWarningBinding

class Snackify {

    companion object {
        //Constant value
        private const val SUCCESS = 200
        private const val INFO = 300
        private const val WARNING = 400
        private const val ERROR = 500
        const val LENGTH_LONG = Snackbar.LENGTH_LONG
        const val LENGTH_SHORT = Snackbar.LENGTH_LONG
        const val LENGTH_INDEFINITE = Snackbar.LENGTH_INDEFINITE

        fun success(view: View, msg:String, length: Int):Snackbar {
            return createSanckbar(view, msg, length, SUCCESS)
        }
        fun info(view: View, msg:String, length: Int):Snackbar {
            return createSanckbar(view, msg, length, INFO)
        }
        fun warning(view: View, msg:String, length: Int):Snackbar {
            return createSanckbar(view, msg, length, WARNING)
        }
        fun error(view: View, msg:String, length: Int):Snackbar {
            return createSanckbar(view, msg, length, ERROR)
        }

        private fun createSanckbar(view:View, msg:String, length:Int, type:Int):Snackbar{

            val snackBar = Snackbar.make(view, msg, length)
            snackBar.view.setBackgroundColor(Color.TRANSPARENT)
            val snackBarLayout = snackBar.view as Snackbar.SnackbarLayout
            snackBarLayout.setPadding(0,0,0,0)

            when(type){
                SUCCESS -> {
                    val binding = LayoutAlertSuccessBinding.inflate(LayoutInflater.from(view.context))
                    binding.messageView.text = msg
                    binding.closeBtn.setOnClickListener {
                        snackBar.dismiss()
                    }
                    snackBarLayout.addView(binding.root)
                }
                INFO -> {
                    val binding = LayoutAlertInfoBinding.inflate(LayoutInflater.from(view.context))
                    binding.messageView.text = msg
                    binding.closeBtn.setOnClickListener {
                        snackBar.dismiss()
                    }
                    snackBarLayout.addView(binding.root)
                }
                WARNING -> {
                    val binding = LayoutAlertWarningBinding.inflate(LayoutInflater.from(view.context))
                    binding.messageView.text = msg
                    binding.closeBtn.setOnClickListener {
                        snackBar.dismiss()
                    }
                    snackBarLayout.addView(binding.root)
                }
                ERROR -> {
                    val binding = LayoutAlertDangerBinding.inflate(LayoutInflater.from(view.context))
                    binding.messageView.text = msg
                    binding.closeBtn.setOnClickListener {
                        snackBar.dismiss()
                    }
                    snackBarLayout.addView(binding.root)
                }

            }
            return snackBar
        }
    }


}