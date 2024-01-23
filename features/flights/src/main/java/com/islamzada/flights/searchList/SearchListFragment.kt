package com.islamzada.flights.searchList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.islamzada.common.flowstate.Status
import com.islamzada.flights.R
import com.islamzada.flights.databinding.FragmentSearchListBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SearchListFragment : Fragment() {

    private lateinit var binding: FragmentSearchListBinding

    val viewModel : SearchListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentSearchListBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            lifecycleScope.launch {
                viewModel.getFlights()
            }
        }

        viewModel.data.observe(viewLifecycleOwner) {
        }

        lifecycleScope.launch {
            viewModel.state.collectLatest {state->
                state?.let {
                    when(it.status) {
                        Status.SUCCESS -> showLoadingProgress(false)
                        Status.ERROR -> showLoadingProgress(false)
                        Status.LOADING -> showLoadingProgress(true)
                    }
                }
            }
        }


        viewModel.data.observe(viewLifecycleOwner) {

        }
    }

    fun showLoadingProgress(isLoad : Boolean) {

    }
}