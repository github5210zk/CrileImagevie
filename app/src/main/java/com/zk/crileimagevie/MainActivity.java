package com.zk.crileimagevie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    private CircleImageView profile_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        profile_image =findViewById(R.id.profile_image);
        //设置正常显示图片
        profile_image.setDisableCircularTransformation(true);
    }
}
