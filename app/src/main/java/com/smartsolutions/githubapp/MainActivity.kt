package com.smartsolutions.githubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.smartsolutions.githubapp.presentation.ui.GitHubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            GitHubAppTheme {
                Surface(color = MaterialTheme.colors.background) {

                }
            }
        }
    }
}