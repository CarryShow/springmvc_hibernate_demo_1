package cn.ch.controller;

import cn.ch.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {

    @ResponseBody
    @RequestMapping(value = "/getjson", method = RequestMethod.GET)
    public User getJson() {
        User user = new User();
        return user;
    }


}
