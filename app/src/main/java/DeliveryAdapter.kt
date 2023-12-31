// DeliveryAdapter.kt
package com.example.deliveryapp.ui.home

import com.example.deliveryapp.R // 正しいRクラスのインポート
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DeliveryAdapter(private var deliveryItems: List<DeliveryItem>) : // varキーワードの使用
    RecyclerView.Adapter<DeliveryAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_delivery, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item: DeliveryItem = deliveryItems[position]
        holder.textViewShopName.text = item.shopName // プロパティアクセス構文の使用
        holder.textViewDeliveryDate.text = item.deliveryDate
        holder.textViewDeliveryStatus.text = item.deliveryStatus
        // ボタンのクリックイベントは後で実装します
    }

    override fun getItemCount(): Int = deliveryItems.size // 単一式関数の使用

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewShopName: TextView = itemView.findViewById(R.id.textViewShopName) // 型指定を削除
        val textViewDeliveryDate: TextView = itemView.findViewById(R.id.textViewDeliveryDate)
        val textViewDeliveryStatus: TextView = itemView.findViewById(R.id.textViewDeliveryStatus)
        val buttonDetail: Button = itemView.findViewById(R.id.buttonDetail)
    }
}
