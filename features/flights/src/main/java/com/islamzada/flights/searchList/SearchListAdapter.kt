package com.islamzada.flights.searchList

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.islamzada.entities.uimodel.FlightListUIModel
import com.islamzada.entities.uimodel.FlightSearchUIState
import com.islamzada.flights.databinding.ListItemFlightBinding

class SearchListAdapter : RecyclerView.Adapter<SearchListViewHolder>() {

    private val differ = AsyncListDiffer(this, differCallBack)

    fun setData(items: List<FlightListUIModel>){
        differ.submitList(items)
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val bind = ListItemFlightBinding.inflate(inflater,parent,false)

        return SearchListViewHolder(bind)

    }

    override fun onBindViewHolder(holder: SearchListViewHolder, position: Int) {
       differ.currentList.getOrNull(position)?.let {
            holder.bind(it)
       }

    }


    companion object {
        private val differCallBack = object : DiffUtil.ItemCallback<FlightListUIModel>(){
            override fun areItemsTheSame(oldItem: FlightListUIModel, newItem: FlightListUIModel): Boolean {
                return oldItem.enuid == newItem.enuid
            }

            override fun areContentsTheSame(oldItem: FlightListUIModel, newItem: FlightListUIModel): Boolean {
                return oldItem == newItem
            }

        }
    }


}


class SearchListViewHolder(private val binding : ListItemFlightBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(viewModel: FlightListUIModel){
        binding.textRV.text = viewModel.airlineName
    }
}