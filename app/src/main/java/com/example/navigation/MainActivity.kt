package com.example.navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        appBarConfiguration = AppBarConfiguration(
            setOf(R.id.mainFragment, R.id.historyFragment)
        )

        setupActionBarWithNavController(navController, appBarConfiguration)


    }
    override fun  onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration)
    }
//    fun goHistory(view: View?) {
//        Log.i("ButtonTag","actionListener")
//        val intent = Intent(this, HistoryFragment::class.java)
//        startActivity(intent)
//    }
//    fun goBalance(view: View?) {
//        Log.i("ButtonTag","history")
//    }
//    fun goPayment(view: View?) {
//        Log.i("ButtonTag","history")
//    }
}