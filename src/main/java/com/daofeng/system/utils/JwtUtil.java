package com.daofeng.system.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.utils
 * @Date 2024/4/23 19:30
 * @Author 瑾。
 * @Version 1.0
 * @Description
 */

@Component
public class JwtUtil {

    // 密钥
    private static final String SECRET = "wbf";

    /**
     * 生成token
     * @param payload
     * @return
     */
    public static String generateToken(Map<String, String> payload) {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.HOUR, 2); // 2小时过期
        // 创建token
        JWTCreator.Builder builder = JWT.create();
        // 设置payload
        payload.forEach(builder::withClaim);
        // 指定签发时间、过期时间 和 签名算法，并返回token
        String token = builder.withIssuedAt(new Date()).withExpiresAt(instance.getTime()).sign(Algorithm.HMAC256(SECRET));
        return token;
    }

    /**
     * 解析token
     * @param token
     * @return
     */
    public static DecodedJWT decodedToken(String token) {
        // 验证token
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SECRET)).build();
        DecodedJWT decodedJWT = verifier.verify(token);
        return decodedJWT;
    }

}