package cn.ch.controller;

import cn.ch.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CommonController {

//    /**把常量传入页面中**/
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String index(ModelMap map) {
//        map.addAttribute("message", "SB");
//        return "index";
//    }
//
//    /**使用路径参数**/
//    @RequestMapping(value = "/user/{name}/{age}", method = RequestMethod.GET)
//    public String getUserInfo_1(ModelMap map, @PathVariable("name") String name, @PathVariable("age") int age) {
//        map.addAttribute("name", name);
//        map.addAttribute("age", age);
//        return "user";
//    }
//
//    /**使用url参数**/
//    @RequestMapping(value = "/user", method = RequestMethod.GET)
//    public String getUserInfo_2(ModelMap map, @RequestParam String name, @RequestParam int age) {
//        map.addAttribute("name", name);
//        map.addAttribute("age", age);
//        return "user";
//    }
//
//    @RequestMapping(value = "/useradd", method = RequestMethod.GET)
//    public String addUserInfo(ModelMap map) {
//        User user = new User();
//        map.addAttribute("user", user);
//        return "user_add";
//    }
//
//    @RequestMapping(value = "/result", method = RequestMethod.GET)
//    public String result(ModelMap map) {
//        return "user_add";
//    }
}
