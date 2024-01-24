package com.islamzada.domain.mapper

import com.islamzada.entities.model.Data
import com.islamzada.entities.uimodel.FlightListUIModel
import com.islamzada.entities.uimodel.FlightSearchUIState
import com.islamzada.entities.uimodel.SearchHeaderUiModel
import javax.inject.Inject

class SearchResponseToUIStateMapper @Inject constructor() : BaseMapper<Data, FlightSearchUIState> {
    override fun map(input: Data): FlightSearchUIState {
        return FlightSearchUIState(
            header = input.getSearchHeader(),
            flights = input.getFlights()
        )
    }

    private fun Data.getSearchHeader() : SearchHeaderUiModel {
        return SearchHeaderUiModel(
            origin = search_parameters?.origin?.city_name ?: "",
            destination = search_parameters?.destination?.city_name ?: "")
    }

    private fun Data.getFlights() : List<FlightListUIModel> {
        return flights?.departure?.map {
            FlightListUIModel(
                enuId = it.enuid ?: "",
                airlineName = it.segments?.firstOrNull()?.marketing_airline ?: "",
                airlineIcon = "",
                price = 0.0)
        } ?: listOf()
    }
}