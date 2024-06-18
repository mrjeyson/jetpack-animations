package com.example.jetpackcomposeanimations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.jetpackcomposeanimations.ui.theme.JetpackComposeAnimationsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            JetpackComposeAnimationsTheme {
//                AnimatedVisibilityFunction()
                AnimatedSizeChangesFunction()
//                AnimatedContent()
//                AnimateSingleFunction()
//                AnimatableFunction()
//                InfiniteAnimateFunction()
            }
        }
    }
}

