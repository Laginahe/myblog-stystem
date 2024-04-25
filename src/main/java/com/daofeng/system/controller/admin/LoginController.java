package com.daofeng.system.controller.admin;

import com.daofeng.system.entity.UserEntity;
import com.daofeng.system.entity.dto.LoginDto;
import com.daofeng.system.entity.vo.UserVo;
import com.daofeng.system.result.Result;
import com.daofeng.system.service.UserService;
import com.daofeng.system.utils.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.controller.admin
 * @Date 2024/4/23 14:55
 * @Author 瑾。
 * @Version 1.0
 * @Description 登录控制器
 */

@RestController
@RequestMapping("/admin")
@Slf4j
public class LoginController {

    @Autowired
    private UserService userService;
    @Autowired
    private JwtUtil jwtUtil;
    @PostMapping("/login")
    public Result login(@RequestBody LoginDto loginDto, HttpSession session) {
        log.info("后台登录："+loginDto.getLoginName());
        Result<UserEntity> login = userService.login(loginDto);
        if (login.getCode() == 200) {
            UserEntity userEntity = login.getData();
            session.setAttribute("loginUser", userEntity.getUserName());
            session.setAttribute("loginUserId", userEntity.getId());
            // 封装token令牌
            HashMap<String, String> payload = new HashMap<>();
            payload.put("loginUser", userEntity.getUserName());
            payload.put("loginUserId", userEntity.getId().toString());
            String token = jwtUtil.generateToken(payload);
            System.out.println(token);

            session.setAttribute("token",token);
            session.setMaxInactiveInterval(60 * 60 ); // 设置session过期时间
            // 返回用户id
            return Result.success(userEntity.getId().toString());
        }
        return Result.error("用户名或密码错误");
    }

    @GetMapping("/profile")
    // 跳转到个人信息页面
    public ModelAndView profile(HttpServletRequest request) {
        Integer loginUserId =(Integer) request.getSession().getAttribute("loginUserId");
        UserEntity user = userService.getUserById(loginUserId);
        if(user == null) {
            return new ModelAndView("wbf/login");
        }
        request.setAttribute("path","profile");
        request.setAttribute("loginUserName", user.getLoginName());
        request.setAttribute("nickName", user.getUserName());
        return new ModelAndView("wbf/profile");
    }

    // 退出
    @GetMapping("/logout")
    public ModelAndView logout(HttpServletRequest request) {
        // 移除session
        request.getSession().removeAttribute("loginUser");
        request.getSession().removeAttribute("loginUserId");
//        request.getSession().removeAttribute("loginUser");
        // 跳转到登录页
        return new ModelAndView("wbf/login");
    }

}