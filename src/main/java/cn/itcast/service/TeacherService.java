package cn.itcast.service;

import cn.itcast.domain.AllBean;

import java.util.List;

/**
 * @author: cdf
 * @create: 2019-12-10 20:28
 **/
public interface TeacherService {

    //教师登录
    AllBean teacherenter(String tid);


    //查看已经写的学生
    List<AllBean>  finished();


    //查看没有写的学生
    List<AllBean>  unfinished();


    //查看学生的详情
    List<AllBean> studentdetails(String tid);


}
