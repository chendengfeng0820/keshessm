package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author: cdf
 * @create: 2019-12-08 23:27
 **/

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层，查询所有的账户信息");
        List<Account> list=accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/save")
    public void saveAccount(Account account ,HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
//        return "list";
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return ;
    }


}
