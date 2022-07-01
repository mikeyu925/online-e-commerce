package com.ywh.ec.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/video")
public class VideoController {

    @RequestMapping("list")
    public Object list(){
        return null;
    }
}
