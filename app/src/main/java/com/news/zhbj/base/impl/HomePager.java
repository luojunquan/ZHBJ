package com.news.zhbj.base.impl;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import android.view.Gravity;
import com.news.zhbj.base.BasePager;

/**
 * Created by 赖上罗小贱 on 2016/5/18.
 */
public class HomePager extends BasePager{
    public HomePager(Activity activity) {
        super(activity);
    }

    @Override
    public void initData() {
        super.initData();
        tvTitle.setText("智慧北京");
        btnMenu.setVisibility(View.GONE);//隐藏菜单按钮
        setSlidingMenuEnable(false);//关闭侧边栏
        TextView text = new TextView(mActivity);
        text.setText("首页");
        text.setTextColor(Color.RED);
        text.setTextSize(25);
        text.setGravity(Gravity.CENTER);

        // 向FrameLayout中动态添加布局
        flContent.addView(text);
    }
}
