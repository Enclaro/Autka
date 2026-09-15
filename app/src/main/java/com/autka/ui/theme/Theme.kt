package com.autka.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val ColorOnRoadBlueDark = Color(0xFF002F54)
private val ColorOnAmberDark = Color(0xFF402300)

private val LightColors =
    lightColorScheme(
        primary = RoadBlue,
        onPrimary = Surface,
        primaryContainer = RoadBlueContainer,
        onPrimaryContainer = Asphalt,
        secondary = Amber,
        onSecondary = Surface,
        background = Canvas,
        onBackground = Asphalt,
        surface = Surface,
        onSurface = Asphalt,
        surfaceVariant = SurfaceMuted,
        onSurfaceVariant = AsphaltMuted,
        outline = Border,
    )

private val DarkColors =
    darkColorScheme(
        primary = RoadBlueDark,
        onPrimary = ColorOnRoadBlueDark,
        primaryContainer = RoadBlueContainerDark,
        onPrimaryContainer = NightForeground,
        secondary = AmberDark,
        onSecondary = ColorOnAmberDark,
        background = NightCanvas,
        onBackground = NightForeground,
        surface = NightSurface,
        onSurface = NightForeground,
        surfaceVariant = NightSurfaceMuted,
        onSurfaceVariant = NightForegroundMuted,
        outline = NightBorder,
    )

@Composable
fun AutkaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        typography = Typography,
        shapes = AutkaShapes,
        content = content,
    )
}
