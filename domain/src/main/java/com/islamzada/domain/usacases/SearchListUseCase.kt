package com.islamzada.domain.usacases

import com.islamzada.common.flowstate.Resource
import com.islamzada.data.repository.FlightRepositoryInterface
import com.islamzada.domain.mapper.SearchResponseToUIStateMapper
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

//class SearchListUseCase @Inject constructor(
//    private val repository : FlightRepositoryInterface,
//    val mapper: SearchResponseToUIStateMapper
//) {
//    suspend fun getList() = flow {
//        emit(Resource.Loading())
//        repository.getFlights()?.data?.let {
//            emit(Resource.Success(mapper.map(it)))
//        } ?: emit(Resource.Error("Empty message error"))
//    }.catch { exception->
//        emit(Resource.Error(exception.localizedMessage))
//    }
//}

class SearchListUseCase @Inject constructor(
    private val repository : FlightRepositoryInterface) {
    suspend fun getList() = flow {
        emit(Resource.Loading())
        repository.getFlights()?.let {
            emit(Resource.Success(it))
        } ?: emit(Resource.Error("Empty message error"))
    }.catch { exception->
        emit(Resource.Error(exception.localizedMessage))
    }
}