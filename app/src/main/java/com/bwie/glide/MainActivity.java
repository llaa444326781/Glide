package com.bwie.glide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    private ImageView img1;
    private ImageView img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=(ImageView)findViewById(R.id.imageView1);
        img2=(ImageView)findViewById(R.id.imageView2);
        Glide.with(this)
                .load("http://img.gaoxiaogif.cn/GaoxiaoGiffiles/images/2015/09/10/shangchuangtaxialai.gif")
                .asGif()
                .placeholder(R.mipmap.ic_launcher)
                .into(img1);
        Glide.with(this)
                .load("http://www.ytxww.com/upload/image/201203/20120309100442708165.jpg")
                .placeholder(R.mipmap.ic_launcher)
                .into(img2);
    }
}
