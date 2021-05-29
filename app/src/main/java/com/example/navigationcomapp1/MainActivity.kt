package com.example.navigationcomapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.*
import com.example.navigationcomapp1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  lateinit var binding: ActivityMainBinding
  private lateinit var navController: NavController
  private lateinit var appBarConfiguration: AppBarConfiguration
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    with(binding) {

      val navHostFragment = supportFragmentManager.findFragmentById(R.id.fcvMain) as NavHostFragment
      navController = navHostFragment.findNavController()

      setSupportActionBar(myToolbar)
      appBarConfiguration = AppBarConfiguration(
        setOf(R.id.firstFragment, R.id.searchFragment), drawerMain
      )
      setupActionBarWithNavController(navController, appBarConfiguration)
      navBottom.setupWithNavController(navController)
      navView.setupWithNavController(navController)
    }


    setContentView(binding.root)
  }

  override fun onCreateOptionsMenu(menu: Menu?): Boolean {
    menuInflater.inflate(R.menu.option_menu, menu)
    return true
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    return if (item.itemId == R.id.conditionsFragment) {
      val action = NavGraphDirections.actionGlobalConditionsFragment()
      navController.navigate(action)
      true
    } else
      item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)
  }

  override fun onSupportNavigateUp(): Boolean {
    return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
  }
}