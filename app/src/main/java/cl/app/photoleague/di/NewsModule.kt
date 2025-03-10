package cl.app.photoleague.di

import cl.app.photoleague.data.NewsApi
import cl.app.photoleague.util.Constants.Companion.BASE_URL_NEWS
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
object NewsModule {

    @Singleton
    @Provides
    @Named("BaseNews")
    fun providesBaseNewsURL() = BASE_URL_NEWS

    @Singleton
    @Provides
    @BaseNews
    fun retrofitInstance(@Named("BaseNews") BASE_URL_NEWS: String): Retrofit{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL_NEWS)
            .build()
    }

    @Singleton
    @Provides
    fun newsApi(@BaseNews retrofit: Retrofit): NewsApi {
        return retrofit.create(NewsApi::class.java)
    }

}