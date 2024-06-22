package money.android.chureup.data.network.response.sample

import kotlinx.serialization.Serializable

@Serializable
data class SampleResponse(val error: String?, val message: String?, val name: String)