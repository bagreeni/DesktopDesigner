import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bronk.common.App
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    Window(
        title = "Desktop Designer",
        onCloseRequest = ::exitApplication,
        state = rememberWindowState(width = 512.dp, height = 512.dp)
    ) {
        App()
    }
}

