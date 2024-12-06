package com.example.androiddz2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val values = ArrayList<ViewModel>()
        values.add(ViewModel(1, R.drawable.banan, "Банан"))
        values.add(ViewModel(2, R.drawable.avokado, "Авокадо"))
        values.add(ViewModel(3, R.drawable.fey, "Фейхоа"))
        values.add(ViewModel(4, R.drawable.chereshnya, "Черешня"))
        values.add(ViewModel(5, R.drawable.sliva, "Слива"))
        values.add(ViewModel(6, R.drawable.tomat, "Томат"))
        values.add(ViewModel(7, R.drawable.nektarin, "Нектарин"))
        values.add(ViewModel(8, R.drawable.mango, "Манго"))
        values.add(ViewModel(9, R.drawable.pomelo, "Помело"))


        findViewById<RecyclerView>(R.id.recyclerView).let{
            it.layoutManager = LinearLayoutManager(this)
            it.adapter = Adapter(values)
        }
    }
}