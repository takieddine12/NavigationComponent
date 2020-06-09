package com.example.navigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.ActivityNavigatorExtras
import androidx.navigation.NavGraph
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       nav.setupWithNavController(nav_host_fragment_container.findNavController())
        var navController = findNavController(R.id.nav_host_fragment_container)
        var appConfiguration = AppBarConfiguration(navController.graph)
        toolbar.setupWithNavController(navController,appConfiguration)

        var actionBarDrawerToggle = ActionBarDrawerToggle(this,drawer,toolbar,0,0)
        actionBarDrawerToggle.syncState()
        drawer.addDrawerListener(actionBarDrawerToggle)
        
    }
}