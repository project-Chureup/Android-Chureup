package money.android.chureup.ui.base

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable


abstract class BaseActivity : ComponentActivity() {
    @Composable
    abstract fun ComposeUI()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeUI()
        }
    }
}
