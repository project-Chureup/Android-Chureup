package money.android.chureup.ui.sample

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import money.android.chureup.data.repository.sample.SampleRepository
import javax.inject.Inject

@HiltViewModel
class SampleViewModel
@Inject
constructor(
    private val sampleRepository: SampleRepository,
) : ViewModel() {
    private val _uiState = MutableStateFlow(SampleUiState.Loading)
    val uiState: StateFlow<SampleUiState> = _uiState

    private val _sideEffect = MutableSharedFlow<SampleSideEffect>()
    val sideEffect: SharedFlow<SampleSideEffect> = _sideEffect
}
