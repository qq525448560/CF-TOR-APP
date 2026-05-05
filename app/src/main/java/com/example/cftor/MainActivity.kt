package com.example.cftor
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    companion object {
        const val UUID = "e258977b-e413-4718-a3af-02d75492c349"
        const val HOST = "patient-voice-154f.88-4b6.workers.dev"
        const val API = "https://$HOST/getServ?hops=2"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(android.R.layout.simple_list_item_1)
        Toast.makeText(this, "Loaded: $API", Toast.LENGTH_LONG).show()
    }
}
