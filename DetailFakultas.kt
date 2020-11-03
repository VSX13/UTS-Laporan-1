package com.example.profilfakultas

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail.*

class DetailFakultas : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail)
        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
        var imageF = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT,0)
            var namaF = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var deskripsiF = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var detailF = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)

            imgDetail.setImageResource(imageF)
            nama_detail.text = namaF
            deskripsi_detail.text = deskripsiF
            tambahan_detail.text = detailF
    }

    }
}
