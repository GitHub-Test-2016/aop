package com.aop.test;

import org.springframework.stereotype.Service;

/**
 * @author yangwenliang, wenliang.yang@htouhui.com
 * @version 1.0
 */
@Service
public class DefaultSystemLogService implements SystemLogService{
    
    @Override
    public void printLog() {
        System.out.println("DefaultSystemLogService");
    }
}
