package com.news.zhbj.base;

import android.app.Activity;
import android.view.View;
/**
 * 菜单详情页基类
 * Created by 赖上罗小贱 on 2016/5/18.
 */
public abstract class BaseMenuDetailPager {
    public Activity mActivity;
    public View mRootView;//根布局对象
    public BaseMenuDetailPager(Activity activity){
        mActivity = activity;
        mRootView = initViews();
    }
    /**
     * 初始化界面
     */
    public abstract View initViews();
    /**
     * 初始化数据
     */
    public void initData(){

    }
}
