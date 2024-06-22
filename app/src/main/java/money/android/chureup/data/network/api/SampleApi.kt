package money.android.chureup.data.network.api

import money.android.chureup.data.network.response.sample.SampleResponse
import retrofit2.Response
import retrofit2.http.GET

interface SampleApi {
    @GET("sample")
    suspend fun getSample(): Response<SampleResponse>
}
