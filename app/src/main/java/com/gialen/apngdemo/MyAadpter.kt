package com.gialen.apngdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.github.penfeizhou.animation.glide.AnimationDecoderOption

class MyAadpter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.image_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 100
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val viewHolder = holder as ViewHolder
        if (position%2==0){
            GlideApp.with(viewHolder.imageView)
                .load("https://misc.aotu.io/ONE-SUNDAY/SteamEngine.png")
                .set(AnimationDecoderOption.DISABLE_ANIMATION_GIF_DECODER, false)
                .into(viewHolder.imageView)
        }else{
            GlideApp.with(viewHolder.imageView)
                .load(R.mipmap.loading)
                .set(AnimationDecoderOption.DISABLE_ANIMATION_GIF_DECODER, false)
                .into(viewHolder.imageView)
        }


    }

    internal inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView
        init {
            imageView = itemView.findViewById(R.id.imageView)
        }
    }
}
