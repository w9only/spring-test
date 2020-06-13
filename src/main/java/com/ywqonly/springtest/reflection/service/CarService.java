package com.ywqonly.springtest.reflection.service;


import com.ywqonly.springtest.reflection.vo.CarVO;

import java.util.List;
import java.util.Map;

public interface CarService {

    /**
     * 通过具体参数执行
     * @param carName
     * @param speed
     */
    void start(String carName, Integer speed);

    /**
     * 通过对象执行
     * @param carVO
     */
    void startByVO(CarVO carVO);

    /**
     * 通过Map执行
     * @param param
     */
    void startByMap(Map<String, Object> param);

}
