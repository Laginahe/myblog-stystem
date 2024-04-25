package com.daofeng.system.interceptor;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.daofeng.system.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.interceptor
 * @Date 2024/4/23 19:27
 * @Author 瑾。
 * @Version 1.0
 * @Description 拦截器
 */

@Component
public class LoginInterceptor {

    @Autowired
    private JwtUtil jwtUtil;

    public boolean checkToken(HttpServletRequest request, HttpServletResponse response, Object o) throws IOException {
        // 获取请求头中的token
        String token =(String) request.getSession().getAttribute("token");
        // 判断token是否为空
        if (token == null || token.equals("")) {
            request.setAttribute("errMsg", "token错误！");
            // 重定向到登录页面
            response.sendRedirect(request.getContextPath() + "/index/login");
            return false;
        }
        DecodedJWT decodedJWT = jwtUtil.decodedToken(token);
        String loginName = decodedJWT.getClaim("userName").asString();
        // 判断token是否过期
        Date exp = decodedJWT.getExpiresAt();
        Date now = new Date();
        System.out.println("loginName:" + loginName);
        System.out.println("过期时间：" + exp);
        if(now.after(exp)) {
            // 重定向到登录页面
            request.getSession().setAttribute("errorMsg", "token过期，请重新登录");
            response.sendRedirect(request.getContextPath() + "/index/login");
            return false;
        } else {
            // 放行
            request.getSession().removeAttribute("errorMsg");
            return true;
        }
    }
}