package com.news.zhbj.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.news.zhbj.R;
import com.news.zhbj.activity.MainActivity;
import com.news.zhbj.base.impl.NewsCenterPager;
import com.news.zhbj.domain.NewsData;
import com.news.zhbj.slid.SlidingMenu;

import java.util.ArrayList;


public class LeftMenuFragment extends BaseFragment{
    private ListView lvList;
    private ArrayList<NewsData.NewsMenuData> mMenuList;
    private int mCurrentPos;// 当前被点击的菜单项
    private MenuAdapter mAdapter;
    @Override
    public View initViews() {
        View view = View.inflate(mActivity, R.layout.fragment_left_menu,null);
        lvList = (ListView) view.findViewById(R.id.lv_list);
        return view;
    }

    @Override
    public void initData() {
        lvList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                mCurrentPos = position;
                mAdapter.notifyDataSetChanged();

                setCurrentMenuDetailPager(position);

                toggleSlidingMenu();// 隐藏
            }
        });
    }

    /**
     * 切换SlidingMenu的状态
     *
     */
    protected void toggleSlidingMenu() {
        MainActivity mainUi = (MainActivity) mActivity;
        SlidingMenu slidingMenu = mainUi.getSlidingMenu();
        slidingMenu.toggle();// 切换状态, 显示时隐藏, 隐藏时显示
    }

    /**
     * 设置当前菜单详情页
     *
     * @param position
     */
    protected void setCurrentMenuDetailPager(int position) {
        MainActivity mainUi = (MainActivity) mActivity;
        ContentFragment fragment = mainUi.getContentFragment();// 获取主页面fragment
        NewsCenterPager pager = fragment.getNewsCenterPager();// 获取新闻中心页面
        pager.setCurrentMenuDetailPager(position);// 设置当前菜单详情页
    }

    // 设置网络数据
    public void setMenuData(NewsData data) {
        mMenuList = data.data;
        mAdapter = new MenuAdapter();
        lvList.setAdapter(mAdapter);
    }

    /**
     * 侧边栏数据适配器
     *
     */
    class MenuAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return mMenuList.size();
        }

        @Override
        public NewsData.NewsMenuData getItem(int position) {
            return mMenuList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = View.inflate(mActivity, R.layout.list_menu_item, null);
            TextView tvTitle = (TextView) view.findViewById(R.id.tv_title);
            NewsData.NewsMenuData newsMenuData = getItem(position);
            tvTitle.setText(newsMenuData.title);

            if (mCurrentPos == position) {// 判断当前绘制的view是否被选中
                // 显示红色
                tvTitle.setEnabled(true);
            } else {
                // 显示白色
                tvTitle.setEnabled(false);
            }

            return view;
        }

    }

}
