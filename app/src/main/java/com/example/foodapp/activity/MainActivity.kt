package com.example.foodapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.foodapp.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.btn_nav)
        val navController= Navigation.findNavController(this, R.id.nav_host_fragment)
        NavigationUI.setupWithNavController(bottomNavigation,navController)
    }
}

//private fun Any.setupWithNavController(
//    bottomNavigation: BottomNavigationItemView?,
//    navController: NavController
//) {
//    TODO("Not yet implemented")
//}

//private fun NavigationUI.setupWithNavController(bottomNavigation: BottomNavigationItemView?, navController: NavController) {
//
//}
