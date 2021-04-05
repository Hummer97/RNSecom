package com.rns.rnsecomapp.ui.SplashScreen

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.rns.rnsecomapp.MainActivity
import com.rns.rnsecomapp.R

class SplashScreenActivity : AppCompatActivity() {
    private val SPLASH_DISPLAY_LENGTH = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.green_100)
        }
        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        Handler().postDelayed({
            val mainIntent = Intent(applicationContext, MainActivity::class.java)
            startActivity(mainIntent)
            finish()
        }, SPLASH_DISPLAY_LENGTH.toLong())


    }
}