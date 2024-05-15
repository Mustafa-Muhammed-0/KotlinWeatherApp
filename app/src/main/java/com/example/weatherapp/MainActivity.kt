package com.example.weatherapp

import android.annotation.SuppressLint
import android.location.Location
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.weatherapp.ui.theme.WeatherAppTheme
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import org.json.JSONObject

class MainActivity : ComponentActivity() {
    var weather_url1 = ""
    var api_id1 = "a0a1dcd668554fe099a9d84e74ff3a03"

    private lateinit var fusedLocationClient: FusedLocationProviderClient
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var WeatherURL:String = "http://api.weatherbit.io/v2.0/current"
        var listVi: ListView = findViewById(R.id.MainListView)
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        Log.e("lat", WeatherURL)
        var addbtn:Button = findViewById(R.id.addButton)

        addbtn.setOnClickListener {
            Log.e("lat", "onClick")

        }

        }

    }

