package com.springcloud2.learn.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @author: lyj
 * @since: 2018/9/5
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi  {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
