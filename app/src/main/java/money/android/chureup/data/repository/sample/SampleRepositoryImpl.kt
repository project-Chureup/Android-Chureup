package money.android.chureup.data.repository.sample

import kotlinx.coroutines.flow.Flow
import money.android.chureup.data.model.Sample

class SampleRepositoryImpl : SampleRepository {
    override suspend fun getSample(): Flow<Sample> {
        TODO("getSample from api")
    }
}