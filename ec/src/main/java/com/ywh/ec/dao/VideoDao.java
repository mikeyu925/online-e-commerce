package com.ywh.ec.dao;
// dao层 存放数据操作的类
import com.ywh.ec.domain.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository  // 会new一个对象放入容器，在需要的地方拿出
public class VideoDao {
    private static Map<Integer, Video> videoMap = new HashMap<>();

    // 模拟一个数据库
    static {
        videoMap.put(1,new Video(1,"剑指offer"));
        videoMap.put(2,new Video(2,"labuladong算法小抄"));
        videoMap.put(3,new Video(3,"java面试指南"));
        videoMap.put(4,new Video(4,"大话设计模式"));
        videoMap.put(5,new Video(5,"图解HTTP"));
    }

    public List<Video> listVideo(){
        List<Video> list = new ArrayList<>();
        list.addAll(videoMap.values());
        return list;
    }

}
