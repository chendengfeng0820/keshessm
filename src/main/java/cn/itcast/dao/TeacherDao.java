package cn.itcast.dao;


import cn.itcast.domain.AllBean;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherDao {


    //教师登录
    @Select("select * from teacher where tid=#{tid} ")
    AllBean teacherenter(String tid);


    //查看已经写的学生
    @Select("select * from student where answer is not null")
    List<AllBean> finished();


    //查看没有写的学生
    @Select("select * from student where answer is null")
    List<AllBean>  unfinished();


    //查看学生的详情
    @Select("select * from student where tid=#{tid}")
    List<AllBean> studentdetails(String tid);



}
