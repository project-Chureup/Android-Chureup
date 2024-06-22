package money.android.chureup.ui.sample

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import money.android.chureup.ui.theme.ChureupTheme

@Composable
fun SampleScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        SampleText(text = "Hello, Sample Activity")
    }
}

@Composable
private fun SampleText(text: String) {
    Text(
        text = text,
    )
}

@Preview
@Composable
private fun SamplePreview() {
    ChureupTheme {
        SampleScreen()
    }
}