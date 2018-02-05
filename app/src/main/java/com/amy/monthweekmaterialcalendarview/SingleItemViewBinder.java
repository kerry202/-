package com.amy.monthweekmaterialcalendarview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import me.drakeet.multitype.ItemViewBinder;

/**
 * @author yangbo
 * @since 2018/2/5
 * @mail 903023560@qq.com
 */
public class SingleItemViewBinder extends ItemViewBinder<SingleItem, SingleItemViewBinder.ViewHolder> {

    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View root = inflater.inflate(R.layout.item_single_item, parent, false);
        return new ViewHolder(root);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull SingleItem singleItem) {
        holder.textView.setText("当前是第"+holder.getLayoutPosition()+"个");
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ViewHolder(View itemView) {
            super(itemView);
            textView= (TextView) itemView.findViewById(R.id.tv_position);
        }
    }
}
