package com.example.kotlinlesson1.ui.fragments

import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kotlinlesson1.R
import com.example.kotlinlesson1.base.BaseFragment
import com.example.kotlinlesson1.databinding.FragmentHomeBinding
import com.example.kotlinlesson1.models.NameModel
import com.example.kotlinlesson1.ui.adapters.NamesAdapter


class HomeFragment : BaseFragment<FragmentHomeBinding>(
    R.layout.fragment_home
) {
    override val binding: FragmentHomeBinding by viewBinding(FragmentHomeBinding::bind)
    private val sharedViewModel: BooksViewModel by activityViewModels()
    private val adapter = NamesAdapter(this::onClick)


    override fun setupViews() {
        initAdapter()
    }

    private fun initAdapter() {
        binding.recyclerviewName.adapter = adapter
        binding.recyclerviewName.layoutManager = LinearLayoutManager(requireContext())
        adapter.setList(sharedViewModel.getBooks())
    }

    private fun onClick(model: NameModel) {
        sharedViewModel.putDescription(model.description)
        findNavController().navigate(R.id.detailsFragment)
    }
}





