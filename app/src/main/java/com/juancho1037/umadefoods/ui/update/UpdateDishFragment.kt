package com.juancho1037.umadefoods.ui.update

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.juancho1037.umadefoods.R

class UpdateDishFragment : Fragment() {

    companion object {
        fun newInstance() = UpdateDishFragment()
    }

    private lateinit var viewModel: UpdateDishViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_update_dish, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(UpdateDishViewModel::class.java)
        // TODO: Use the ViewModel
    }

}