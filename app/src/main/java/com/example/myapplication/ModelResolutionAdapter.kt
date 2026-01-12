package com.example.myapplication

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalDensity
import kotlin.math.min

/**
 * To fit different resolution model for Compose
 */
open class ModelResolutionAdapter {
    companion object {
        /**
         * the design size for standard
         */
        private val STANDARD_SMALL_SIDE_DP = 360

        /**
         * init density and set it to global config
         */
        fun initDensity(context: Context) {
            val displayMetrics = context.resources.displayMetrics
            val widthDp = displayMetrics.widthPixels / displayMetrics.density
            val heightDp = displayMetrics.heightPixels / displayMetrics.density
            val smallSideDp = min(widthDp, heightDp)
            displayMetrics.scaledDensity *= smallSideDp / STANDARD_SMALL_SIDE_DP
        }
    }
}

@Composable
fun Fit(content: @Composable () -> Unit) {
//    CompositionLocalProvider(LocalDensity provides) {
//        content()
//    }
}