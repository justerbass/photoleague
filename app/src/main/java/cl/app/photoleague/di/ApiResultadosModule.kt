package cl.app.photoleague.di

import cl.app.photoleague.data.ApiResultPhotoLeague
import cl.app.photoleague.util.Constants.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiResultadosModule {

    @Singleton
    @Provides
    @Named("BaseURL")
    fun providesBaseURL() = BASE_URL

    @Singleton
    @Provides
    @BaseRetrofit
    fun providesRetrofit(@Named("BaseURL") baseUrl: String): Retrofit{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(baseUrl)
            .build()
    }

    @Singleton
    @Provides
    fun providesApiResultados(@BaseRetrofit retrofit: Retrofit): ApiResultPhotoLeague {
        return retrofit.create(ApiResultPhotoLeague::class.java)

    }


}