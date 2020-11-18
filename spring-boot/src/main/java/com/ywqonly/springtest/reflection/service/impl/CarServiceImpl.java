package com.ywqonly.springtest.reflection.service.impl;

import com.ywqonly.springtest.reflection.service.CarService;
import com.ywqonly.springtest.reflection.vo.CarVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public void start(String carName, Integer speed) {
        System.out.println(carName + "启动了,速度" + speed+",方式：具体参数");
    }

    @Override
    public void startByVO(CarVO carVO) {
        System.out.println("新版测试 222");
        System.out.println(carVO.getCarName() + "启动了,速度" + carVO.getSpeed()+",方式：对象");
    }

    @Override
    public void startByMap(Map<String, Object> param) {
        System.out.println(param.get("carName") + "启动了,速度" + Integer.parseInt(String.valueOf(param.get("speed"))) +",方式：Map");

    }

}
