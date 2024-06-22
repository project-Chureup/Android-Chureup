package money.android.chureup.ui.sample

import androidx.compose.runtime.Composable
import money.android.chureup.ui.base.BaseActivity
import money.android.chureup.ui.theme.ChureupTheme

class SampleActivity : BaseActivity() {
    @Composable
    override fun ComposeUI() {
        ChureupTheme {
            SampleScreen()
        }
    }
}