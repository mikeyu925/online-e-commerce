package com.ywh.ec.controller;

import com.ywh.ec.config.wxConfig;
import com.ywh.ec.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/test")
public class TestController {
    @Autowired
    private wxConfig wxconfig;

    @GetMapping("show_config")
    public JsonData showConfig(){
        Map<String,String> map = new HashMap<>();
        map.put("appid",wxconfig.getAppId());
        map.put("secret",wxconfig.getAppsecret());
        return JsonData.buildSuccess(map);
    }

}
