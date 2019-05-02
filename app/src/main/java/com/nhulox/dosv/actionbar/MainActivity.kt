package com.nhulox.dosv.actionbar

import android.annotation.SuppressLint
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.getMessage)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.menu_1, menu)
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.item_1->{
                message("Option 1", R.color.green)
                ///Toast.makeText(this, "This is the item 1", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.item_2->{
                message("Option 2", R.color.blue)
                //Toast.makeText(this, "This is the item 2", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.item_3->{
                message("Option 3", R.color.red)
                //Toast.makeText(this, "This is the item 3", Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun message(msg: String?, color: Int){
        textView.text = msg
        textView.textSize = 24F
        textView.setBackgroundColor(getColor(color))
    }
}
