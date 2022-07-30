package com.ilgiz.coinsapi.presentation.ui.fragments

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.entypoints.R
import com.example.entypoints.databinding.FragmentCoinsBinding
import com.ilgiz.coinsapi.presentation.base.BaseFragment
import com.ilgiz.coinsapi.presentation.ui.adapters.CoinsAdapter
import com.ilgiz.coinsapi.tools.Either
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CoinsFragment : BaseFragment<CoinsViewModel, FragmentCoinsBinding>(
    R.layout.fragment_coins
) {
    override val viewModel: CoinsViewModel by viewModels()
    override val binding by viewBinding(FragmentCoinsBinding::bind)
    private val coinsAdapter = CoinsAdapter()

    override fun setupListeners() {
        setupRecyclerView()
    }

    private fun setupRecyclerView() = with(binding.recyclerCoins) {
        layoutManager = LinearLayoutManager(requireContext())
    }

    override fun setupSubscribes() {
        setupObserves()
    }

    private fun setupObserves() {
        viewModel.fetchCoins().observe(viewLifecycleOwner) {
            when (it) {
                is Either.Left -> {
                    Log.e("error", it.value)
                }
                is Either.Right -> {
                    Log.e("success", it.value.toString())
                    coinsAdapter.submitList(it.value)
                }
            }
        }
    }

    private fun setupAdapter() {
        binding.recyclerCoins.adapter = coinsAdapter
    }
}