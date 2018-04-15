package org.resort.controller;

import org.resort.entity.State;
import org.resort.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @Author 郭文虎
 */
@RequestMapping("/state")
@Controller
public class StateController {
    @Autowired
    StateService service;

    /**
     * 获取所有State
     * @param map 存储容器
     * @return 跳转页面"super/showAllState"
     */
    @RequestMapping("/getAllState.html")
    public String getAllState(Map<String,Object> map) {
        List<State> stateList = service.getAllEntity();
        map.put("stateList",stateList);
        for (State state:
             stateList) {
            state.show();
        }
        return "super/showAllState";
    }
}
