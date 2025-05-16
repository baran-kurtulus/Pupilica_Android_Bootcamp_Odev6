package com.example.odev6.data

import java.io.Serializable


data class Oyun(var oyun_id: Int,
                var oyun_ad: String,
                var resim: String,
                var fiyat: Int) : Serializable{
}