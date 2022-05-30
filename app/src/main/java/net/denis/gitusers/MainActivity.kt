package net.denis.gitusers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.denis.gitusers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}   