package com.news.zhbj.domain;

import java.util.ArrayList;

/**
 * 组图数据
 * Created by 赖上罗小贱 on 2016/5/25.
 */
public class PhotosData {

    public int retcode;
    public PhotosInfo data;

    public class PhotosInfo {
        public String title;
        public ArrayList<PhotoInfo> news;
    }

    public class PhotoInfo {
        public String id;
        public String listimage;
        public String pubdate;
        public String title;
        public String type;
        public String url;
    }
}

