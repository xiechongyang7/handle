package com.jdbdy.handle.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: xiechongyang
 * @create: 2021-11-12 17:41
 **/
@Component
public class ShowTask {



    @Scheduled(cron = "0 30 21 * * ? ")
    public void showTask(){

    }

}
