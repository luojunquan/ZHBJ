package com.news.zhbj.base;
import android.view.Gravity;
import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import com.news.zhbj.domain.NewsData.NewsTabData;
/**
 * 页签详情页
 * Created by 赖上罗小贱 on 2016/5/18.
 */
public class TabDetailPager extends BaseMenuDetailPager{
    NewsTabData mTabData;
    private TextView tvText;

    public TabDetailPager(Activity activity, NewsTabData newsTabData) {
        super(activity);
        mTabData = newsTabData;
    }

    @Override
    public View initViews() {
        tvText = new TextView(mActivity);
        tvText.setText("页签详情页");
        tvText.setTextColor(Color.RED);
        tvText.setTextSize(25);
        tvText.setGravity(Gravity.CENTER);
        return tvText;
    }

    @Override
    public void initData() {
        tvText.setText(mTabData.title);
    }
}
