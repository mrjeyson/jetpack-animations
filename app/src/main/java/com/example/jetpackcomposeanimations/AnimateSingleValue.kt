package com.example.jetpackcomposeanimations

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlin.random.Random

@Composable
fun AnimateSingleFunction() {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var scale by remember {
            mutableStateOf(1f)
        }
        var color by remember {
            mutableStateOf(Color.Red)
        }
        val animateScale by animateFloatAsState(targetValue = scale, label = "")
        val animateColor by animateColorAsState(targetValue = color, label = "")

        Box(
            modifier = Modifier
                .size(100.dp)
                .scale(animateScale)
                .clip(CircleShape)
                .background(animateColor)
                .clickable {
                    scale += 0.1f
                    color = Color(
                        red = Random.nextInt(255),
                        green = Random.nextInt(255),
                        blue = Random.nextInt(255)
                    )
                }
        )
    }
}