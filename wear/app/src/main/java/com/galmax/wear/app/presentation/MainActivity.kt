package com.galmax.wear.app.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.galmax.core.presentation.designsystem_wear.RunawayTheme
import com.galmax.wear.run.presentation.TrackerScreenRoot

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)

        setContent {
            RunawayTheme {
                TrackerScreenRoot()
            }
        }
    }

}