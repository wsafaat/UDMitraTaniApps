package com.example.udmitrataniapps.model.pegawai

import androidx.annotation.Nullable

class Pesanan {
    lateinit var status_pesanan : String
    var nomor_induk : String? = null
    var lahan_pelanggan : LahanPelanggan = null ?: LahanPelanggan()
    class LahanPelanggan {
        lateinit var alamat : String
        var pelanggan : Pelanggan = Pelanggan()

        class Pelanggan {
            var nama_lengkap : String? = null
            var telepon : String? = null
        }
    }
}