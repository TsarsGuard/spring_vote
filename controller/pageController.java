package com.victor.spring_vote.controller;

import com.victor.spring_vote.entity.Candida;
import com.victor.spring_vote.service.inf.ICandidaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by zhao zhihao on 2018/9/29.
 */
@Controller
public class pageController {
    @Resource(name = "candidaServiceImpl")
   private ICandidaService iCandidaService;

    /**
     * 首页
     *
     * @return
     */
    @RequestMapping("/")
    public String page() {

        return "system/index";
    }


    /**
     * 跳转
     *
     * @return
     */
    @RequestMapping("/redirect")
    public String page2() {

        return "redirect/redirect";
    }

    @RequestMapping("/login")
    public String page4() {
        return "redirect/login";
    }

    @RequestMapping("/test1")
    public String test1(HttpServletRequest request, Model model) {
        List<Candida> list = iCandidaService.show();
        System.out.println(request.getParameter("username"));
        System.out.println(request.getParameter("password"));
        return "redirect/login";
    }

    /**
     * 视图
     *
     * @param model
     * @return
     */
    @RequestMapping("/model")
    public String page3(Model model) {
        model.addAttribute("name", "seawater");
        return "hello";
    }
}
