package com.ywh.ec.dao;
// dao层 存放数据操作的类
import com.ywh.ec.domain.Video;

import java.util.HashMap;
import java.util.Map;

public class VideoDao {
    private static Map<Integer, Video> videoMap = new HashMap<>();



    static {
        videoMap.put(1,new Video(1,"剑指offer"));
        videoMap.put(2,new Video(2,"labuladong算法小抄"));
        videoMap.put(3,new Video(3,"java面试指南"));
        videoMap.put(4,new Video(4,"大话设计模式"));
        videoMap.put(5,new Video(5,"图解HTTP"));
    }

}
