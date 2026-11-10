package ir.arminniromandi.rasadban.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.QrCodeScanner
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Sealed class representing all destinations / routes in the application.
 */
sealed class Screen(val route: String) {
    // Bottom navigation items
    data object Scan : Screen("scan")
    data object Vault : Screen("vault")
    data object Settings : Screen("settings")

    // Other screens (not present in bottom navigation)
    data object Detail : Screen("detail/{itemId}") {
        fun createRoute(itemId: String): String = "detail/$itemId"
    }
}

/**
 * Items that appear specifically in the Bottom Navigation Bar.
 */
sealed class BottomNavItem(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    data object Scan : BottomNavItem(
        route = Screen.Scan.route,
        title = "Scan",
        icon = Icons.Default.QrCodeScanner
    )

    data object Vault : BottomNavItem(
        route = Screen.Vault.route,
        title = "Vault",
        icon = Icons.Default.Lock
    )

    data object Settings : BottomNavItem(
        route = Screen.Settings.route,
        title = "Settings",
        icon = Icons.Default.Settings
    )

    companion object {
        val items = listOf(Scan, Vault, Settings)
    }
}
