package com.islamzada.flights.searchList

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.islamzada.common.base.BaseFragment
import com.islamzada.common.flowstate.Status
import com.islamzada.flights.databinding.FragmentSearchListBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SearchListFragment : BaseFragment <FragmentSearchListBinding, SearchListViewModel> (FragmentSearchListBinding::inflate) {

    val viewModel : SearchListViewModel by viewModels()

    private lateinit var adapter : SearchListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRvAdapter()

        lifecycleScope.launch {
            viewModel.getFlights()

        }

        viewModel.data.observe(viewLifecycleOwner) {
            adapter.setData(it?.flights ?: listOf())
        }

    }


    override fun mViewModel(): SearchListViewModel {
        return viewModel
    }

    private fun initRvAdapter(){
        adapter = SearchListAdapter()
        binding.rv.layoutManager = LinearLayoutManager(context)
        binding.rv.adapter = adapter
    }

}