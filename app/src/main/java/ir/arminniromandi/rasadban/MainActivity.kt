package ir.arminniromandi.rasadban

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import ir.arminniromandi.rasadban.presentation.navigation.MainScreen
import ir.arminniromandi.rasadban.ui.theme.RasadBanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RasadBanTheme {
                MainScreen()
            }
        }
    }
}

