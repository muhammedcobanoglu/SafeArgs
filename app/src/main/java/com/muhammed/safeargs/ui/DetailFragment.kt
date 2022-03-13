package com.muhammed.safeargs.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.muhammed.safeargs.databinding.FragmentDetailBinding

/**
 * Created by Muhammed COBANOGLU on 13.03.2022.
 */

class DetailFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentDetailBinding
    private val args by navArgs<DetailFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailBinding.inflate(inflater, container, false)

        setupData()

        return binding.root
    }

    private fun setupData() {
        binding.fruit = args.fruit
    }
}