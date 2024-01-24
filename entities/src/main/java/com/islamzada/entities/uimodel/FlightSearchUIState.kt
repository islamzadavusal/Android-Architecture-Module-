package com.islamzada.entities.uimodel

data class FlightSearchUIState (
    val header: SearchHeaderUiModel,
    val flights: List<FlightListUIModel>)
data class SearchHeaderUiModel(
    val origin : String,
    val destination: String)
data class FlightListUIModel(
    var enuId : String,
    var airlineIcon : String,
    var airlineName : String,
    val price : Double )