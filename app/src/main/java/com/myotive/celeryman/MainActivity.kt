package com.myotive.celeryman

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.myotive.celeryman.presenters.CeleryInterface
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val presenter: CeleryInterface by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imagePath = presenter.getRandomImage()

        presenter.loadCeleryMan(imagePath, iv_celeryman)
    }
}
