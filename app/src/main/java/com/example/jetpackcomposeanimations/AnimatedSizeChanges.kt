package com.example.jetpackcomposeanimations

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AnimatedSizeChangesFunction() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var isAllTextVisible by remember {
            mutableStateOf(false)
        }
        Text(
            text = "Animations are essential in a modern mobile app in order to realize a smooth and understandable user experience. Use animateContentSize() to achieve automatic size change animations.".repeat(
                2
            ),
            modifier = Modifier
                .padding(5.dp)
                .background(Color.LightGray)
                .clickable {
                    isAllTextVisible = !isAllTextVisible
                }
                .animateContentSize(
                    /*animationSpec = tween(
                        durationMillis = 200,
                        easing = LinearEasing
                    )*/
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioLowBouncy,
                        stiffness = Spring.StiffnessMediumLow
                    )
                ),
            maxLines = if (isAllTextVisible) Int.MAX_VALUE else 2
        )
    }
}