package com.islamzada.flights.searchList

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.islamzada.common.base.BaseViewModel
import com.islamzada.common.flowstate.Resource
import com.islamzada.common.flowstate.State
import com.islamzada.domain.mapper.SearchResponseToUIStateMapper
import com.islamzada.domain.usacases.SearchListUseCase
import com.islamzada.entities.uimodel.FlightSearchUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collectLatest
import javax.inject.Inject

//@HiltViewModel
//class SearchListViewModel @Inject constructor(
//    val searchUseCase : SearchListUseCase
//) : ViewModel() {
//    val state : MutableStateFlow<State?> = MutableStateFlow(null)
//    val data = MutableLiveData<FlightSearchUIState?>()
//
//    suspend fun getFlights() {
//        searchUseCase.getList().collectLatest {
//            when(it) {
//                is Resource.Error -> state.emit(State.error(it.message))
//                is Resource.Loading -> state.emit(State.loading())
//                is Resource.Success -> {
//                    state.emit(State.success())
//                        data.postValue(it.data)
//                    }
//                }
//            }
//        }
//    }

@HiltViewModel
class SearchListViewModel @Inject constructor(
    val searchUseCase : SearchListUseCase,
    private val mapper: SearchResponseToUIStateMapper) : BaseViewModel() {
    val data = MutableLiveData<FlightSearchUIState?>()

    suspend fun getFlights() {
        searchUseCase.getList().collectLatest {
            when(it) {
                is Resource.Error -> state.emit(State.error(it.message))
                is Resource.Loading -> state.emit(State.loading())
                is Resource.Success -> {
                    state.emit(State.success())
                    it.data?.data?.let {
                        val mappedData = mapper.map(it)
                        data.postValue(mappedData)
                    }
                }
            }
        }
    }
}