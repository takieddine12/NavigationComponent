package com.example.navigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.navigation.ActivityNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nav.setupWithNavController(nav_host_fragment_container.findNavController())

        setSupportActionBar(toolbar)
        var actionBarDrawerToggle = ActionBarDrawerToggle(this,drawer,toolbar,0,0)
        actionBarDrawerToggle.syncState()
        drawer.addDrawerListener(actionBarDrawerToggle)

    }
}