package com.myotive.celeryman

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.myotive.celeryman.presenters.CeleryPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val presenter = CeleryPresenter(this)
        val imagePath = presenter.getRandomImage()

        presenter.loadCeleryMan(imagePath, iv_celeryman)
    }
}
