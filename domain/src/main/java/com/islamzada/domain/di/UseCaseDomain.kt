package com.islamzada.domain.di

import com.islamzada.data.repository.FlightRepositoryInterface
import com.islamzada.domain.mapper.SearchResponseToUIStateMapper
import com.islamzada.domain.usacases.SearchListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseDomain {

//    @Provides
//    @Singleton
//    fun provideSearchUseCase(repositoryInterface: FlightRepositoryInterface, mapper: SearchResponseToUIStateMapper) = SearchListUseCase(repositoryInterface, mapper)

    @Provides
    @Singleton
    fun provideSearchUseCase(repositoryInterface: FlightRepositoryInterface) = SearchListUseCase(repositoryInterface)
}