package com.yxg.his.user.web;

import com.yxg.his.user.dto.UserDto;
import com.yxg.his.user.entity.User;
import com.yxg.his.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Administrator on 2016/10/19.
 */
@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginInit(){
        return "user/login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@Valid UserDto userDto, Errors errors, ModelMap modelMap){
        String errorMessages="";
        if(errors.hasErrors()){
            List<ObjectError> objectErrorList=errors.getAllErrors();
            for(ObjectError objectError:objectErrorList){
                errorMessages+=objectError.getDefaultMessage()+"<br>";
            }
            modelMap.put("errorMessages",errorMessages);
            return "user/login";
        }

        User user=userService.selectByLoginNamePassword(userDto);
        if(user==null){
            errorMessages="用户名或密码错误";
            modelMap.put("errorMessages",errorMessages);
            return "user/login";
        }else{
            modelMap.put("user",user);

        }
        return "user/home";

    }
    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String register(){
        return "user/register";
    }
}
