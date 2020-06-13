package com.ywqonly.springtest.reflection;

import com.ywqonly.springtest.reflection.service.impl.ReflectionService;
import com.ywqonly.springtest.reflection.vo.CarVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringReflectionTest {

    @Resource
    private ReflectionService reflectionService;

    @Test
    public void paramTest() throws Exception {
        Map<String, Object>  paramMap = new HashMap<>();

        paramMap.put("carName", "宝马");
        paramMap.put("speed", "1");
        reflectionService.invokeService("carServiceImpl", "start", paramMap);
    }

    @Test
    public void objectTest() throws Exception {
        Map<String, Object>  paramMap = new HashMap<>();

        paramMap.put("carName", "宝马");
        paramMap.put("speed", "2");
        reflectionService.invokeService("carServiceImpl", "startByVO", paramMap);
    }

    @Test
    public void mapTest() throws Exception {
        Map<String, Object>  paramMap = new HashMap<>();

        paramMap.put("carName", "宝马");
        paramMap.put("speed", "3");
        reflectionService.invokeService("carServiceImpl", "startByMap", paramMap);
    }

}
