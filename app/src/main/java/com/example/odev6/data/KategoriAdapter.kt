package com.example.odev6.data

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.odev6.R
import com.example.odev6.databinding.CardTasarimBinding
import com.example.odev6.databinding.KategoriTasarimBinding

class KategoriAdapter(var mContext: Context, var kategoriListesi: List<Kategori>)
    : RecyclerView.Adapter<KategoriAdapter.KategoriCardTasarimTutucu>() {
        private val gradients = listOf(
            R.drawable.bg_gradient_first,
            R.drawable.bg_gradient_2,
            R.drawable.bg_gradient_3,
            R.drawable.bg_gradient_4
        )
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): KategoriCardTasarimTutucu {
        val binding = KategoriTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return KategoriCardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(
        holder: KategoriCardTasarimTutucu,
        position: Int
    ) {
        val row = position / 2
        val gradientRes = gradients[row % gradients.size]



        val kategori = kategoriListesi.get(position)
        val t = holder.tasarim
        t.textViewKategori.text = kategori.kategori_ad

        t.kategoriLayout.background = ContextCompat.getDrawable(mContext, gradientRes)

        t.imageViewKategori.setImageResource(
            mContext.resources.getIdentifier(kategori.kategori_icon, "drawable", mContext.packageName)
        )

    }

    override fun getItemCount(): Int {
        return kategoriListesi.size
    }

    inner class KategoriCardTasarimTutucu(var tasarim: KategoriTasarimBinding): RecyclerView.ViewHolder(tasarim.root)




}