package com.example.kotlinlesson1.ui.fragments

import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kotlinlesson1.R
import com.example.kotlinlesson1.base.BaseFragment
import com.example.kotlinlesson1.databinding.FragmentDetailsBinding
import kotlinx.coroutines.launch

class DetailsFragment : BaseFragment<FragmentDetailsBinding>(
    R.layout.fragment_details
) {
    override val binding: FragmentDetailsBinding by viewBinding(FragmentDetailsBinding::bind)
    private val viewModel: BooksViewModel by activityViewModels()

    override fun setupViews() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.description.observe(viewLifecycleOwner) { description ->
                binding.tvDescription.text = description
            }
        }
    }

}