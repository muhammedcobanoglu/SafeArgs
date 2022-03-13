package com.muhammed.safeargs.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.muhammed.safeargs.R
import com.muhammed.safeargs.data.Fruit
import com.muhammed.safeargs.data.fruitList
import com.muhammed.safeargs.databinding.FragmentHomeBinding

/**
 * Created by Muhammed COBANOGLU on 13.03.2022.
 */
class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        setupUI()

        return binding.root
    }

    private fun setupUI() {
        val fruitList = fruitList(this.resources)
        val fruitListAdapter = FruitListAdapter(fruitList)

        binding.fruitList.layoutManager = LinearLayoutManager(activity)
        binding.fruitList.addItemDecoration(
            DividerItemDecoration(
                binding.fruitList.context,
                (binding.fruitList.layoutManager as LinearLayoutManager).orientation
            )
        )
        binding.fruitList.adapter = fruitListAdapter
    }
}