package com.example.odev6.data

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.odev6.databinding.CardTasarimBinding

class OyunAdapter(var mContext: Context, var oyunListesi: List<Oyun>)
    : RecyclerView.Adapter<OyunAdapter.CardTasarimTutucu>(){

    inner class CardTasarimTutucu(var tasarim: CardTasarimBinding): RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {

        val oyun = oyunListesi.get(position)
        val t = holder.tasarim
        t.imageViewOyun.setImageResource(
            mContext.resources.getIdentifier(oyun.resim, "drawable", mContext.packageName)
        )

    }

    override fun getItemCount(): Int {
        return oyunListesi.size
    }



}