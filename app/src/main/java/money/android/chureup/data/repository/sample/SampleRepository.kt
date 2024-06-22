package money.android.chureup.data.repository.sample

import kotlinx.coroutines.flow.Flow
import money.android.chureup.data.model.Sample

interface SampleRepository {
    suspend fun getSample(): Flow<Sample>
}