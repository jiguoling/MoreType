package com.werb.library

import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.View
import com.werb.library.action.MoreAction

/**
 * [MoreViewHolder] Base ViewHolder implement Action fun
 * Created by wanbo on 2017/7/2.
 */
abstract class MoreViewHolder(itemView: View) : ViewHolder(itemView) {

    private var action: MoreAction? = null

    fun setActionListener(action: MoreAction?) {
        this.action = action
    }

    fun addOnClickListener(viewId: Int) {
         itemView.findViewById<View>(viewId).setOnClickListener { action?.moreListener?.onItemClick(it, adapterPosition) }
    }

    fun addOnClickListener(view: View) {
        view.setOnClickListener { action?.moreListener?.onItemClick(it, adapterPosition) }
    }

    fun addOnLongClickListener(viewId: Int) {
        itemView.findViewById<View>(viewId).setOnClickListener { action?.moreListener?.onItemLongClick(it, adapterPosition) }
    }

    fun addOnLongClickListener(view: View) {
        view.setOnClickListener { action?.moreListener?.onItemLongClick(it, adapterPosition) }
    }

    fun getChildView(viewId: Int) : View = itemView.findViewById(viewId)

}