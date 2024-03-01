package com.example.myapplication

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import kotlin.math.min

/**
 * To fit different resolution model for Compose
 */
class ModelResolutionAdapter {
    fun getD(context: Context): Density {
        val displayMetrics = LocalContext.current.resources.displayMetrics
        Density()
    }
}

fun initDensity(context: Context): Density {
    val displayMetrics = context.resources.displayMetrics
    val smallSideDp =
        min(displayMetrics.widthPixels, displayMetrics.heightPixels) / displayMetrics.density

}

@Composable
fun Fit(density: Density, content: @Composable () -> Unit) {
    CompositionLocalProvider(LocalDensity provides density) {
        content()
    }
}