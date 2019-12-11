package cn.itcast.controller;

import cn.itcast.domain.AllBean;
import cn.itcast.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author: cdf
 * @create: 2019-12-10 20:24
 **/

@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;


    //教师登录
    @RequestMapping("/teacherenter")
    public String teacherenter(@ModelAttribute AllBean allBean, HttpServletRequest request){
        HttpSession session=request.getSession(true);
        session.setAttribute("teachersession",allBean.getTid());
        System.out.println(session.getAttribute("teachersession"));
        AllBean allBean1=teacherService.teacherenter(allBean.getTid());
        if(allBean1.getTpassword().equals(allBean.getTpassword())){
            return "start1";
        }else{
            return "false";
        }
    }
	
}
