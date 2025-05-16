package com.example.odev6.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.odev6.R
import com.example.odev6.data.Kategori
import com.example.odev6.data.KategoriAdapter
import com.example.odev6.data.Oyun
import com.example.odev6.data.OyunAdapter
import com.example.odev6.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        val oyunListesi = ArrayList<Oyun>()
        oyunListesi.add(Oyun(1, "Death Loop", "death_loop", 600))
        oyunListesi.add(Oyun(2, "Death Stranding", "death_stranding", 800))
        oyunListesi.add(Oyun(3, "Doom The Dark Ages", "doom_the_dark_ages", 1200))
        oyunListesi.add(Oyun(4, "FC24", "fc24", 1000))
        oyunListesi.add(Oyun(5, "Forza Horizon 5", "forza_horizon_5", 400))
        oyunListesi.add(Oyun(6, "It Takes Two", "it_takes_two", 700))

        val oyunAdapter = OyunAdapter(requireContext(), oyunListesi)
        binding.rvOyun.adapter = oyunAdapter
        binding.rvOyun.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)

        val kategorListesi = ArrayList<Kategori>()
        kategorListesi.add(Kategori(1, "Bağımsız", "lightbulb"))
        kategorListesi.add(Kategori(2, "Aile", "family"))
        kategorListesi.add(Kategori(3, "Klasikler", "videogame"))
        kategorListesi.add(Kategori(4, "Nişancı", "target"))
        kategorListesi.add(Kategori(5, "Spor", "sports_football"))
        kategorListesi.add(Kategori(6, "Macera", "sailing"))
        kategorListesi.add(Kategori(7, "Platform", "steps"))
        kategorListesi.add(Kategori(8, "Dövüş", "sports_mma"))



        val kategoriAdapter = KategoriAdapter(requireContext(), kategorListesi)
        binding.rvKategori.adapter = kategoriAdapter
        binding.rvKategori.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)






        return binding.root
    }

}