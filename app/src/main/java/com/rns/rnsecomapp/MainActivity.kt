package com.rns.rnsecomapp

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.WindowManager
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.bb.bigbrotheruser.base.BaseActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.rns.rnsecomapp.SharedPrefManager.SharedPrefManager
import com.rns.rnsecomapp.ui.LogIn.LoginActivity
import com.rns.rnsecomapp.ui.MyBag.MyCartDataClass
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<MainView, MainPresenter>(),MainView {
    private lateinit var navController: NavController
    private lateinit var sharedPrefManager: SharedPrefManager
    private lateinit var mUser_Id:String
    override fun getContentView(): Int {
       return R.layout.activity_main
    }

    override fun getPresenterClass(): Class<MainPresenter> {
        return MainPresenter::class.java
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        sharedPrefManager = SharedPrefManager.getInstance(applicationContext)
        mUser_Id = sharedPrefManager.user.id.toString()
        presenter?.getMyCartDetails(mUser_Id)
        if(!sharedPrefManager.isLoggedIn)
        {
            var intent = Intent(applicationContext,LoginActivity::class.java)
            startActivity(intent)
        }

        navController = findNavController(R.id.nav_host_fragment)

        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.green_100)
        }
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_dashboard, R.id.navigation_wishList, R.id.navigation_account, R.id.navigation_notifications))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        getSupportActionBar()?.hide();

        main_activity_toolbar_add_cart_btn.setOnClickListener {
            navController.navigate(R.id.myBagFragment)
        }
    }

    override fun getMyCartResponse(response: MyCartDataClass) {
        if(response.status == 200)
        {
            main_activity_toolbar_add_cart_count.text = response.count.toString()
        }
        else
        {
            main_activity_toolbar_add_cart_count.text = "0"
        }
    }


//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        menuInflater.inflate(R.menu.bottom_nav_menu, menu)
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when (item.itemId) {
//            R.id.navigation_notification -> {
//                navController.navigate(R.id.notificationFragment)
//                // Toast.makeText(applicationContext, "click on setting", Toast.LENGTH_LONG).show()
//                true
//            }
//            R.id.navigation_download -> {
//                navController.navigate(R.id.downloadsFragment)
//                return true
//            }
//
//            else -> super.onOptionsItemSelected(item)
//        }
//    }
//
//
//    override fun onSupportNavigateUp(): Boolean {
//        return NavigationUI.navigateUp(navController, appBarConfiguration)
//    }

}