package cn.edu.gdmec.android.phpapplication;

import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

/**
 * Created by HP on 2018/5/15.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private List<Map<String, Object>> testData;
    public MyAdapter(List<Map<String, Object>> testData) {
        this.testData=testData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        //LayoutInflater作用是将layout的xml布局文件实例化为view对象，把listview_item转换成view1
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listview_item,viewGroup,false);
        ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder;
    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        //
        viewHolder.img.setImageBitmap((Bitmap)(testData.get(position).get("bitmap")) );
        viewHolder.username.setText((String) (testData.get(position).get("username")));
        String age=testData.get(position).get("age").toString();
        viewHolder.age.setText(age+"岁");
        viewHolder.gender.setText("性别："+testData.get(position).get("gender"));



    }

    @Override
    public int getItemCount() {
        return testData.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView img;
        public TextView username;
        public TextView age;
        public TextView gender;


        public ViewHolder(View view) {
            super(view);
            username=(TextView) view.findViewById(R.id.textView);
            age=(TextView)view.findViewById(R.id.sui);
            gender=(TextView)view.findViewById(R.id.xinbie);
            img=(ImageView) view.findViewById(R.id.imageView);

        }
    }
}