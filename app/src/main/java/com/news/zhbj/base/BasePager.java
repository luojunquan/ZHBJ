package com.news.zhbj.base;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

import com.news.zhbj.R;
import com.news.zhbj.activity.MainActivity;
import com.news.zhbj.slid.SlidingMenu;

/**
 * Created by 赖上罗小贱 on 2016/5/18.
 */
public class BasePager {
    public Activity mActivity;
    public View mRootView;// 布局对象
    public TextView tvTitle;// 标题对象
    public FrameLayout flContent;// 内容
    public ImageButton btnMenu;// 菜单按钮
    public BasePager(Activity activity){
        mActivity = activity;
        initViews();
    }
/*
初始化布局
 */
    private void initViews() {
        mRootView = View.inflate(mActivity, R.layout.base_pager,null);
        tvTitle = (TextView) mRootView.findViewById(R.id.tv_title);
        flContent = (FrameLayout) mRootView.findViewById(R.id.fl_content);
        btnMenu = (ImageButton) mRootView.findViewById(R.id.btn_menu);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleSlidingMenu();//切换按钮
            }
        });
    }
    /**
     * 切换SlidingMenu的状态
     *
     */
    private void toggleSlidingMenu() {
        MainActivity mainUi = (MainActivity) mActivity;
        SlidingMenu slidingMenu = mainUi.getSlidingMenu();
        slidingMenu.toggle();// 切换状态, 显示时隐藏, 隐藏时显示
    }
    /*
    初始化数据
     */
    public void initData(){

    }
    /*
    设置侧边栏开启或关闭
     */
    public void setSlidingMenuEnable(boolean enable){
        MainActivity mainUi = (MainActivity) mActivity;
        SlidingMenu slidingMenu = mainUi.getSlidingMenu();
        if (enable){
            slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        }else {
            slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_NONE);
        }
    }
}
