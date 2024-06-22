package money.android.chureup.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import money.android.chureup.data.repository.sample.SampleRepository
import money.android.chureup.data.repository.sample.SampleRepositoryImpl

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {
    @Binds
    fun provideSampleRepository(sampleRepositoryImpl: SampleRepositoryImpl): SampleRepository

}
