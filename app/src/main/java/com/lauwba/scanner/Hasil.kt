package com.lauwba.scanner

import android.content.ContextWrapper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lauwba.scanner.scanner.ScannerActivity
import kotlinx.android.synthetic.main.activity_hasil.*

class Hasil :  ScannerActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        textViewCode.text=

                getSharedPreferences(Constant.PREFS_NAME, ContextWrapper.MODE_PRIVATE)
            .getString(Constant.url, "not set")
    }
}
