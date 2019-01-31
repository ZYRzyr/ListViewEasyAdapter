/*******************************************************************************
 * Copyright 2019 Yuran Zhang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.zyr.listvieweasyadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public abstract class ListViewEasyAdapter<DATA_TYPE, VH> extends BaseAdapter {
    protected Context context;
    protected List<DATA_TYPE> data;

    public ListViewEasyAdapter(List<DATA_TYPE> data) {
        this.data = data;
    }

    protected abstract int setLayoutRes();

    protected abstract VH initViewHolder();

    protected abstract void initView(VH holder, View view);

    protected abstract void setupView(VH holder, int position);

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        context = parent.getContext();
        VH holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(setLayoutRes(), parent, false);
            holder = initViewHolder();
            initView(holder, convertView);
            convertView.setTag(holder);
        } else {
            holder = (VH) convertView.getTag();
        }
        setupView(holder, position);
        return convertView;
    }
}
