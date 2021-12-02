package com.jdbdy.handle.service.impl;

import com.jdbdy.handle.service.PushTempleMsgService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: xiechongyang
 * @create: 2021-11-09 17:57
 **/
@Service
public class PushTempleMsgServiceImpl implements PushTempleMsgService {

    @Value("${wx.app.secret}")

    @Override
    public void pushTempleMsg() {


    }

}
