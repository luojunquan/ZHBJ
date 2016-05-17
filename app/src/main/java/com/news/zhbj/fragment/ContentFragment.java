package com.news.zhbj.fragment;

import android.view.View;

import com.news.zhbj.R;


public class ContentFragment extends BaseFragment {
    @Override
    public View initViews() {
        View view = View.inflate(mActivity, R.layout.fragment_content,null);
        return view;
    }
}
