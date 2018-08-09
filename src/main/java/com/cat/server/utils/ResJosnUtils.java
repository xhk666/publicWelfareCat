package com.cat.server.utils;

/**
 * @author : dado
 * @time : 2018/8/9 19:55
 */
public class ResJosnUtils {
    private static final String SUCCESS_RES = "{\"code\":0,\"reason\":\"success\"}";
    private static final String SERVER_ERROR = "{\"code\":-1,\"reason\":\"server busy!\"}";


    public static String success() {
        return SUCCESS_RES;
    }

    public static String fail() {
        return SERVER_ERROR;
    }
}
