package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.domain.AllBean;
import cn.itcast.service.StudentService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sun.org.apache.bcel.internal.generic.ALOAD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author: cdf
 * @create: 2019-12-10 20:22
 **/
@CrossOrigin(origins = "*",maxAge = 3600)
@Controller
public class StudentController extends Thread{

    @Autowired
    private StudentService studentService;

    //学生添加个人信息
    @RequestMapping(value = "/register")
    public String register(@ModelAttribute AllBean allBean) throws IOException {
        System.out.println(JSON.toJSONString(allBean));
        studentService.register(allBean);
        return "success";

    }

    //学生登录
    @RequestMapping("/enter")
    public String studententer(@ModelAttribute AllBean allBean,HttpServletRequest request){
        System.out.println(JSON.toJSONString(allBean));
        HttpSession session=request.getSession(true);
        session.setAttribute("session",allBean.getSid());
        System.out.println(session.getAttribute("session"));
        AllBean allBean1=studentService.studententer(allBean.getSid());
        String answer1=allBean1.getAnswer1();
        if(answer1!=null){
            return "orfinish";
        }
        if(allBean1.getSpassword().equals(allBean.getSpassword())){
            return "start";
        }else{
            return "false";
        }
    }

    //保存答案到数据库
    @RequestMapping("/saveanswer")
    public String answer(@ModelAttribute AllBean allBean,HttpServletRequest request){
        HttpSession session=request.getSession();
        System.out.println(session.getAttribute("session"));
        String sid= (String) session.getAttribute("session");
        allBean.setSid(sid);
        allBean.setAnswer1(allBean.getAnswer1());
        allBean.setAnswer2(allBean.getAnswer2());
        allBean.setAnswer3(allBean.getAnswer3());
        allBean.setAnswer4(allBean.getAnswer4());
        allBean.setAnswer5(allBean.getAnswer5());
        studentService.answer(allBean);

//        String answer1=allBean.getAnswer1();
//        String answer2=allBean.getAnswer2();
//        String amswer3=allBean.getAnswer3();
//        String answer4=allBean.getAnswer4();
//        String answer5=allBean.getAnswer5();
//        studentService.answer(allBean);
        return "success1";

    }




	
}
