package com.example.mytest2.listView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mytest2.R;

public class MyListAdapater extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public MyListAdapater(Context context) {
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    static class ViewHolder {
        private ImageView imageView;
        private TextView tvTitle,tvTime,tvContent;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if (view == null) {
            view = mLayoutInflater.inflate(R.layout.layout_list_item,null);
            viewHolder = new ViewHolder();
            viewHolder.imageView = view.findViewById(R.id.tv);
            viewHolder.tvContent = view.findViewById(R.id.tv_content);
            viewHolder.tvTime = view.findViewById(R.id.tv_time);
            viewHolder.tvTitle = view.findViewById(R.id.tv_title);
            view.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) view.getTag();
        }
        //给控件赋值
        viewHolder.tvTitle.setText("这是标题");
        viewHolder.tvTime.setText("1999/01/13");
        viewHolder.tvContent.setText("这是内容");
        Glide.with(mContext).load("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg-blog.csdnimg.cn%2F20191105100204720.png%3Fx-oss-process%3Dimage%2Fwatermark%2Ctype_ZmFuZ3poZW5naGVpdGk%2Cshadow_10%2Ctext_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2dlbmdiYW9sb25n%2Csize_16%2Ccolor_FFFFFF%2Ct_70&refer=http%3A%2F%2Fimg-blog.csdnimg.cn&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1639148032&t=8e1c61613175b496cd603cf50e8ade16").into(viewHolder.imageView);
        return view;
    }
}
