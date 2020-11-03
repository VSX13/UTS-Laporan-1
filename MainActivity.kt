package com.example.profilfakultas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.detail.*
import kotlinx.android.synthetic.main.list.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFakultas()
        mRecycleView.layoutManager = LinearLayoutManager(this)
        mRecycleView.setHasFixedSize(true)
        mRecycleView.adapter = AdapterFakultas(data, { onItem: DataFakultas -> onItemClicked(onItem) })
    }

    private fun  onItemClicked(onItem: DataFakultas) {
        val showDetailActivityIntent = Intent(this@MainActivity, DetailFakultas::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.logoFakultas)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.namaFakultas)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.DeskripsiFakultas)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.DetailDeskripsi)
    }

    private fun createFakultas(): List<DataFakultas> {
        val mrList = ArrayList<DataFakultas>()
        mrList.add(
            DataFakultas(
                R.drawable.logo,
                "FAKULTAS ILMU KOMPUTER",
                "Fakultas Ilmu Komputer terbilang muda ketimbang fakultas-fakultas lain di lingkungan UPN 'Veteran' Jawa Timur. Awalnya, Program Studi Teknik Informatika dan Sistem Informasi bergabung dengan Fakultas Teknik Industri yang berganti nama menjadi Fakultas Teknik. Namun, dua prodi tersebut kini bernaung di bawah fakultas tersendiri. \n\n" +
                        "Fakultas Ilmu Komputer terdiri dari 2 program studi, yaitu : \n",
                "1. Prodi S1 Teknik Informatika\n" +
                        "2.Progdi S1 Sistem Informasi"
            )
        )
        mrList.add(
            DataFakultas(
                R.drawable.logo,
                "FAKULTAS TEKNIK",
                "Fakultas Teknik merupakan fakultas dengan program studi terbanyak di lingkungan kampus UPN 'Veteran' Jawa Timur. Pada awal berdirinya di tahun 1968, fakultas ini bernama Fakultas Teknik Kimia. Tak heran, Program Studi Teknik Kimia UPN 'Veteran' Jawa Timur jadi favorit dan telah terakreditasi A. \n\n" +
                        "Fakultas Teknik terdiri dari 5 program studi, yaitu : \n",
                "1. Progdi S1 Teknik Kimia\n" +
                        "2. Progdi S1 Teknik Industri\n" +
                        "3. Progdi S1 Teknik Sipil\n" +
                        "4. Progdi S1 Teknik Lingkungan\n" +
                        "5. Progdi S1 Teknologi Pangan"
            )
        )
        mrList.add(
            DataFakultas(
                R.drawable.logo,
                "FAKULTAS EKONOMI DAN BISNIS",
                "Fakultas Ekonomi UPN 'Veteran' Jawa Timur merupakan salah satu fakultas tertua dan memiliki mahasiswa terbanyak di lingkungan kampus. Fakultas ini didirikan tahun 1956 dengan nama Akademi Administrasi Perusahaan 'Veteran' (AAPV). Nama ini kemudian menjadi cikal bakal nama kampus UPN 'Veteran' Jawa Timur yang memang bermaksud mengenang para veteran pejuang pembela kemerdekaan. Dekan pertama fakultas ini adalah Letkol Umar Usman. \n\n" +
                        "Fakultas Ekonomi dan Bisnis terdiri dari 3 program studi, yaitu :",
                "1. Progdi S1 Ekonomi Pembangunan\n" +
                        "2. Progdi S1 Akuntansi\n" +
                        "3. Progdi S1 Manajemen"
            )
        )
        mrList.add(
            DataFakultas(
                R.drawable.logo,
                "FAKULTAS PERTANIAN",
                "Didirikan sejak 17 Mei 1968, Fakultas Pertanian UPN 'Veteran' Jawa Timur sudah berusia separuh abad lebih. \n\n" +
                        "Fakultas Pertanian terdiri dari 2 program studi, yaitu :",
                "1. Progdi S1 Agroteknologi\n" +
                        "2. Progdi S1 Agrobisnis"
            )
        )
        mrList.add(
            DataFakultas(
                R.drawable.profil,
                "Profil Saya",
                "Nama: Muhammad Hilman\n"+
                        "Umur: 19\n" +
                        "TTL: 20 Oktober 2000\n" +
                        "Alamat: Perumahan Graha Penta Block AH-21, Bluru Kidul Sidoarjo\n" +
                        "No.HP: 082132129437\n" +
                        "Email: VSX.KiryuuSento@gmail.com\n" + "github: https://github.com/VSX13\n",
                "Riwayat Pendidikan : \n" +
                        "1. SD Muhammadiyah 2, Jetis Sidoarjo\n" +
                        "2. SMP Muhammadiyah 1 Sidoarjo \n" +
                        "3. SMK Muhammadiyah 2 Taman Sepanjang Sidoarjo \n\n" +
                        "Penghargaan :-"
            )
        )
        return mrList
    }
}