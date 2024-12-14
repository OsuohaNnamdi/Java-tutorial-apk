package com.d4rk.androidtutorials.ui.screens.settings.display.theme.style

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val primaryLight = Color(color = 0xFF006D3B)
val onPrimaryLight = Color(color = 0xFFFFFFFF)
val primaryContainerLight = Color(color = 0xFF49E58C)
val onPrimaryContainerLight = Color(color = 0xFF004221)
val secondaryLight = Color(color = 0xFF326945)
val onSecondaryLight = Color(color = 0xFFFFFFFF)
val secondaryContainerLight = Color(color = 0xFFB7F3C5)
val onSecondaryContainerLight = Color(color = 0xFF1B5332)
val tertiaryLight = Color(color = 0xFF00658E)
val onTertiaryLight = Color(color = 0xFFFFFFFF)
val tertiaryContainerLight = Color(color = 0xFF8DD2FF)
val onTertiaryContainerLight = Color(color = 0xFF003D57)
val errorLight = Color(color = 0xFFBA1A1A)
val onErrorLight = Color(color = 0xFFFFFFFF)
val errorContainerLight = Color(color = 0xFFFFDAD6)
val onErrorContainerLight = Color(color = 0xFF410002)
val backgroundLight = Color(color = 0xFFF3FCF1)
val onBackgroundLight = Color(color = 0xFF161D17)
val surfaceLight = Color(color = 0xFFF3FCF1)
val onSurfaceLight = Color(color = 0xFF161D17)
val surfaceVariantLight = Color(color = 0xFFD7E7D7)
val onSurfaceVariantLight = Color(color = 0xFF3C4A3F)
val outlineLight = Color(color = 0xFF6C7B6E)
val outlineVariantLight = Color(color = 0xFFBBCBBC)
val scrimLight = Color(color = 0xFF000000)
val inverseSurfaceLight = Color(color = 0xFF2A322B)
val inverseOnSurfaceLight = Color(color = 0xFFEBF3E9)
val inversePrimaryLight = Color(color = 0xFF43E188)
val surfaceDimLight = Color(color = 0xFFD4DCD2)
val surfaceBrightLight = Color(color = 0xFFF3FCF1)
val surfaceContainerLowestLight = Color(color = 0xFFFFFFFF)
val surfaceContainerLowLight = Color(color = 0xFFEDF6EB)
val surfaceContainerLight = Color(color = 0xFFE8F0E6)
val surfaceContainerHighLight = Color(color = 0xFFE2EBE0)
val surfaceContainerHighestLight = Color(color = 0xFFDCE5DB)

val primaryDark = Color(color = 0xFF79FFAA)
val onPrimaryDark = Color(color = 0xFF00391C)
val primaryContainerDark = Color(color = 0xFF33D57E)
val onPrimaryContainerDark = Color(color = 0xFF00361A)
val secondaryDark = Color(color = 0xFF99D4A8)
val onSecondaryDark = Color(color = 0xFF00391C)
val secondaryContainerDark = Color(color = 0xFF0A4626)
val onSecondaryContainerDark = Color(color = 0xFFA3DEB1)
val tertiaryDark = Color(color = 0xFFCEEAFF)
val onTertiaryDark = Color(color = 0xFF00344C)
val tertiaryContainerDark = Color(color = 0xFF70C5F9)
val onTertiaryContainerDark = Color(color = 0xFF003249)
val errorDark = Color(color = 0xFFFFB4AB)
val onErrorDark = Color(color = 0xFF690005)
val errorContainerDark = Color(color = 0xFF93000A)
val onErrorContainerDark = Color(color = 0xFFFFDAD6)
val backgroundDark = Color(color = 0xFF0E150F)
val onBackgroundDark = Color(color = 0xFFDCE5DB)
val surfaceDark = Color(color = 0xFF0E150F)
val onSurfaceDark = Color(color = 0xFFDCE5DB)
val surfaceVariantDark = Color(color = 0xFF3C4A3F)
val onSurfaceVariantDark = Color(color = 0xFFBBCBBC)
val outlineDark = Color(color = 0xFF869587)
val outlineVariantDark = Color(color = 0xFF3C4A3F)
val scrimDark = Color(color = 0xFF000000)
val inverseSurfaceDark = Color(color = 0xFFDCE5DB)
val inverseOnSurfaceDark = Color(color = 0xFF2A322B)
val inversePrimaryDark = Color(color = 0xFF006D3B)
val surfaceDimDark = Color(color = 0xFF0E150F)
val surfaceBrightDark = Color(color = 0xFF333B34)
val surfaceContainerLowestDark = Color(color = 0xFF08100A)
val surfaceContainerLowDark = Color(color = 0xFF161D17)
val surfaceContainerDark = Color(color = 0xFF1A211B)
val surfaceContainerHighDark = Color(color = 0xFF242C25)
val surfaceContainerHighestDark = Color(color = 0xFF2F3730)

object Colors {
    @Composable
    fun primaryText() = MaterialTheme.colorScheme.onBackground

    @Composable
    fun secondaryText() = MaterialTheme.colorScheme.onSurface

    @Composable
    fun highlightedText() = MaterialTheme.colorScheme.primary
}