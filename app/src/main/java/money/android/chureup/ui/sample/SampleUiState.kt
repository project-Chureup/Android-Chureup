package money.android.chureup.ui.sample

sealed class SampleUiState {
    object Loading : SampleUiState()
    data class Success(
        val id: String,
        val name: String,
        val isFollowing: Boolean = false,
        val isBookmarked: Boolean = false,
    ) : SampleUiState()

    class Error(
        val exception: Throwable,
        val isNetworkError: Boolean = false,
    ) : SampleUiState()
}
