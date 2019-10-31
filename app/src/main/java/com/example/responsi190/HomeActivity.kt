package com.example.responsi190

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {

    private lateinit var rvHape: RecyclerView
    private var list: ArrayList<Hape> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "Daftar Hape"
        }

        rvHape = findViewById(R.id.rv_hape)
        rvHape.setHasFixedSize(true)

        list.addAll(HapeData.listData)
        showRecyclerList()
    }

//+++++
    private fun showRecyclerList() {
        rvHape.layoutManager = LinearLayoutManager(this)
        val listHapeAdapter = ListHapeAdapter(list)
        rvHape.adapter = listHapeAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.account -> {
                intent = Intent(this,AccountActivity::class.java)
                startActivity(intent)
            }
        }
    }
}

