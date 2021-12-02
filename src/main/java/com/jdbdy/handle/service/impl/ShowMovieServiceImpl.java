package com.jdbdy.handle.service.impl;

import com.jdbdy.handle.entity.MoviePlan;
import com.jdbdy.handle.mapper.MovieInfoMapper;
import com.jdbdy.handle.mapper.MoviePlanMapper;
import com.jdbdy.handle.mapper.MovieShowInfoMapper;
import com.jdbdy.handle.service.ShowMovieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: xiechongyang
 * @create: 2021-11-12 18:17
 **/
@Service
public class ShowMovieServiceImpl implements ShowMovieService {

    @Resource
    private MovieInfoMapper movieInfoMapper;
    @Resource
    private MoviePlanMapper moviePlanMapper;
    @Resource
    private MovieShowInfoMapper movieShowInfoMapper;

    @Override
    public void showMovie() {

        MoviePlan moviePlan = new MoviePlan();

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        moviePlan.setPlanTime(sdf.format(date));

        List<MoviePlan> plans = moviePlanMapper.selectByExample(moviePlan);


    }
}
