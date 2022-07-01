package com.ywh.ec.service.impl;

import com.ywh.ec.dao.VideoDao;
import com.ywh.ec.domain.Video;
import com.ywh.ec.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {
    //    private VideoDao videoDao = new VideoDao(); // 以前的做法
    // 采用注解的方式
    @Autowired
    private VideoDao videoDao;
    @Override
    public List<Video> listVideo() {
        return videoDao.listVideo();
    }
}
