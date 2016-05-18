package com.news.zhbj.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
/**
 * Created by 赖上罗小贱 on 2016/5/18.
 */
public class NoScrollViewPager extends ViewPager{
    public NoScrollViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public NoScrollViewPager(Context context) {
        super(context);
    }
    // 表示事件是否拦截, 返回false表示不拦截
    @Override
    public boolean onInterceptTouchEvent(MotionEvent arg0) {
        return false;
    }

    /**
     * 重写onTouchEvent事件,什么都不用做
     */
    @Override
    public boolean onTouchEvent(MotionEvent arg0) {
        return false;
    }
}
