package cn.itcast.dao;


import cn.itcast.domain.AllBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao {


    //学生注册添加个人信息
    @Insert("insert into student (sid,sname,sage,ssex,scollege,spassword) values(#{sid},#{sname},#{sage},#{ssex},#{scollege},#{spassword})")
    void register(AllBean allBean);


    //学生登录
    @Select("select * from student where sid=#{sid} ")
    AllBean studententer(String sid);


    //保存答案
    @Update("update student set answer1=#{answer1},answer2=#{answer2},answer3=#{answer3},answer4=#{answer4},answer5=#{answer5} where sid=#{sid}")
    void answer(AllBean allBean);


    //是否写了
    @Select("select answer1 where sid=#{sid}")
    AllBean orfinish(String sid);
}



