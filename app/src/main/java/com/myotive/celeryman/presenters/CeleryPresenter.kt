package com.myotive.celeryman.presenters

import android.content.Context
import android.net.Uri
import android.widget.ImageView
import com.bumptech.glide.Glide
import timber.log.Timber

interface CeleryInterface{
    fun loadCeleryMan(imagePath: String, imageView: ImageView)
    fun getRandomImage(): String
}

class CeleryPresenter(private val context: Context) : CeleryInterface {
    override fun loadCeleryMan(imagePath: String, imageView: ImageView) {

        Timber.i("Loading image: $imagePath")

        Glide.with(context)
                .load(Uri.parse(imagePath))
                .into(imageView)
    }

    override fun getRandomImage(): String {
        val assets = context.resources?.assets?.list("")?.filter { it.endsWith("gif") }
        val random = assets?.shuffled()?.first()

        return "file:///android_asset/$random"
    }
}