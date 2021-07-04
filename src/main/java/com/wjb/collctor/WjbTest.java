package com.wjb.collctor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;

@Controller
@RequestMapping("test")
public class WjbTest {
    @RequestMapping("day")
    public String login(HttpSession session){
        Date date = new Date();
        session.setAttribute("aa",date);
        System.out.println();
        return "login";
    }

}
