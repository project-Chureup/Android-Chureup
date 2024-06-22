package money.android.chureup.ui.sample

sealed class SampleSideEffect {
    data class SendToast(val message: String) : SampleSideEffect()
    data class StartStory(
        val userId: Int,
    ) : SampleSideEffect()

    class NavigateToMyPage(val userId: Int) : SampleSideEffect()
}
