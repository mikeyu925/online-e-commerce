package com.ywh.ec;

import com.ywh.ec.service.VideoService;
import com.ywh.ec.utils.JsonData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcResultMatchersDsl;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {EcApplication.class})
@AutoConfigureMockMvc
@PropertySource({"api/v1/test"})
public class VideoTest {
    @Autowired
    private VideoService videoService;
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testVideoListApi() throws Exception {
        // Mockmvc可以模仿客户端发送请求 perform：执行一个MockMvcRequestBuilders请求
        // andExpect：添加ResultMatcher->MockMvcResultMatchers验证规则
        // andReturn：返回相应的MvcResult结果
        MvcResult mvcResult =  mockMvc.perform(MockMvcRequestBuilders.get("api/v1/test/list")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
        // 获取状态码
        int status = mvcResult.getResponse().getStatus();

        System.out.println(status);
    }

}
