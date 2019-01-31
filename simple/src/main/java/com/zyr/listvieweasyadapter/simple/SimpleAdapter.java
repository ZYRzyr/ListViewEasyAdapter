package com.zyr.listvieweasyadapter.simple;

import android.view.View;
import android.widget.TextView;

import com.zyr.listvieweasyadapter.ListViewEasyAdapter;

import java.util.List;

import androidx.core.content.ContextCompat;

public class SimpleAdapter extends ListViewEasyAdapter<String, SimpleAdapter.ViewHolder> {

    public SimpleAdapter(List<String> data) {
        super(data);
    }

    @Override
    protected int setLayoutRes() {
        return R.layout.item_simple;
    }

    @Override
    protected ViewHolder initViewHolder() {
        return new ViewHolder();
    }

    @Override
    protected void initView(ViewHolder holder, View view) {
        holder.textView = view.findViewById(R.id.text_view);
    }

    @Override
    protected void setupView(ViewHolder holder, int position) {
        holder.textView.setTextColor(ContextCompat.getColor(context, R.color.colorAccent));
        holder.textView.setText(data.get(position));
    }

    static class ViewHolder {
        TextView textView;
    }
}
