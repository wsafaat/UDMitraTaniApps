package com.example.udmitrataniapps.model

import com.example.udmitrataniapps.model.auth.PegawaiModel
import com.example.udmitrataniapps.model.auth.PelangganModel
import com.example.udmitrataniapps.model.pelanggan.DataLahan
import com.example.udmitrataniapps.model.pelanggan.Pesanan
import com.example.udmitrataniapps.model.pelanggan.VarietasPadi
import java.util.ArrayList

class ResponseModel {
    var success = 0
    lateinit var message: String
    lateinit var access_token: String
    lateinit var token_id: String
    var pelanggan = PelangganModel()
    var data_lahan = DataLahan(id = 0, nama_lahan = "", alamat = "", luas_lahan = 0, sejarah_lahan = "")
    var pegawai = PegawaiModel()
    var pesanan = Pesanan()
}