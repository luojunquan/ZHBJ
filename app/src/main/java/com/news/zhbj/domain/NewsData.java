package com.news.zhbj.domain;

import java.util.ArrayList;

/**
 * 网络分类信息的封装
 * 字段名字必须和服务器返回的字段名一致, 方便gson解析
 * Created by 赖上罗小贱 on 2016/5/18.
 */
public class NewsData {
    public int retcode;
    public ArrayList<NewsMenuData> data;
    public class NewsMenuData{
        public String id;
        public String title;
        public int type;
        public String url;

        public ArrayList<NewsTabData> children;
        public String toString() {
            return "NewsMenuData [title=" + title + ", children=" + children
                    + "]";
        }
    }
    // 新闻页面下11个子页签的数据对象
    public class NewsTabData{
        public String id;
        public String title;
        public int type;
        public String url;

        public String toString(){
            return "NewsTabData [title=" + title + "]";
        }
    }
    public String toString() {
        return "NewsData [data=" + data + "]";
    }
}
