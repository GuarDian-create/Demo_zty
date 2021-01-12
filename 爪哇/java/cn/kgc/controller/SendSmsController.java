package cn.kgc.controller;

import cn.kgc.service.impl.SmsUtilsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class SendSmsController {

    @Autowired
    private SmsUtilsImpl smsUtils;

    @RequestMapping("/sendSms")
    @ResponseBody
    public String sendSms(String telephone,HttpServletRequest request)  {
        String s = smsUtils.sendSms(telephone);
        HttpSession session = request.getSession();
        session.setAttribute("Code",s);
        System.out.println(telephone+"yzm!!!："+session.getAttribute("Code"));
        return s;
    }

}