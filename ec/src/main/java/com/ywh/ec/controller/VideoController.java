package com.ywh.ec.controller;

import com.ywh.ec.domain.Video;
import com.ywh.ec.service.VideoService;
import com.ywh.ec.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/pub/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping("list")   // 只能被get请求
    public JsonData list(){
        List<Video> list = videoService.listVideo();
        return JsonData.buildSuccess(list);
    }

    @PostMapping("save_video_chapter")
    public JsonData saveVideoChapter(@RequestBody Video video){
        System.out.println(video.toString());
        return JsonData.buildSuccess("");
    }


}
