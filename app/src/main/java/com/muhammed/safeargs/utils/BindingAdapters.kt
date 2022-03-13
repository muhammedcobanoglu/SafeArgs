package com.muhammed.safeargs.utils

import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.BindingAdapter
import androidx.navigation.findNavController
import com.muhammed.safeargs.data.Fruit
import com.muhammed.safeargs.ui.HomeFragmentDirections

/**
 * Created by Muhammed COBANOGLU on 13.03.2022.
 */
class BindingAdapters {

    companion object {
        @BindingAdapter("android:imgRes")
        @JvmStatic
        fun setImageResource(imageView: ImageView, resource: Int) {
            imageView.setImageResource(resource)
        }

        @BindingAdapter("android:sendFruitInfo")
        @JvmStatic
        fun startAction(view: ConstraintLayout, fruit: Fruit) {
            view.setOnClickListener {
                val action = HomeFragmentDirections.actionHomeFragmentToDetailFragment(fruit)
                view.findNavController().navigate(action)
            }
        }
    }
}