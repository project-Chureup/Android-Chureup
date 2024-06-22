package money.android.chureup.ui.sample

import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import money.android.chureup.ui.base.BaseActivity
import money.android.chureup.ui.theme.ChureupTheme

class SampleActivity : BaseActivity() {
    private val viewModel: SampleViewModel by viewModels()

    @Composable
    override fun ComposeUI() {
        ChureupTheme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                Text(
                    text = "Sample Activity",
                )
            }
        }
    }
}