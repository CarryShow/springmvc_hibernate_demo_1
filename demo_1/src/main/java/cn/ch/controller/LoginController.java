package cn.ch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {


    /**默认进入首页**/
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap map) {
        return "index";
    }

    /**登陆页**/
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap map) {
        return "login";
    }

    /**结果页**/
    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String result(ModelMap map, @RequestParam String account, @RequestParam String psw) {

        if (account.equals("111111") && psw.equals("111111")) {
            map.addAttribute("msg_result", "登陆成功，欢迎来到芝麻地管理系统！");
        } else {
            map.addAttribute("msg_result", "登陆失败，衮！");
        }
        return "result";
    }

}
