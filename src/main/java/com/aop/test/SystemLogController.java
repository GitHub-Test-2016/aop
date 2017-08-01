package com.aop.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yangwenliang, wenliang.yang@htouhui.com
 * @version 1.0
 */
@Controller
@RequestMapping("controller")
public class SystemLogController {
    
    @Autowired
    private SystemLogService systemLogService;
    
    @RequestMapping("/log")
    @Log(operationType = "测试打印", operationName = "测试打印日志")
    public void testAop(){
        systemLogService.printLog();
    }
    
}
