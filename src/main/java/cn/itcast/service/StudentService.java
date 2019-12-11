package cn.itcast.service;

import cn.itcast.domain.AllBean;

public interface StudentService {

    //学生注册添加个人信息
    void register(AllBean allBean);


    //学生登录
    AllBean studententer(String sid);


    //保存答案
    void answer(AllBean allBean);

    //是否完成
    AllBean orfinish(String sid);
}
