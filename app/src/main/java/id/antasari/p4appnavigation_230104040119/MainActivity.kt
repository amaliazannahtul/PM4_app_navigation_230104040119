package id.antasari.p4appnavigation_230104040119

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import id.antasari.p4appnavigation_230104040119.nav.NavGraph

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Semua UI Compose dipanggil dari sini
        setContent {
            NavGraph()
        }
    }
}
