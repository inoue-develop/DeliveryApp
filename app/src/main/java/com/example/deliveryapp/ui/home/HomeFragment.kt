// HomeFragment.kt
package com.example.deliveryapp.ui.home

import com.example.deliveryapp.R // 正しいRクラスのインポート
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView // lateinitを使用してnullabilityを削除
    private lateinit var adapter: DeliveryAdapter // lateinitを使用してnullabilityを削除
    private lateinit var deliveryItems: MutableList<DeliveryItem> // lateinitを使用してnullabilityを削除

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(view.context)

        // ダミーデータの生成
        deliveryItems = mutableListOf(
            DeliveryItem("Amazon", "2023/12/25", "配送済み"),
            DeliveryItem("Amazon", "2023/12/26", "再配達")
            // 他のアイテムを追加...
        )
        adapter = DeliveryAdapter(deliveryItems)
        recyclerView.adapter = adapter
        return view
    }
}