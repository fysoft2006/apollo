package com.github.knightliao.apollo.utils.web;

import java.net.UnknownHostException;

/**
 * 
 * @author liaoqiqi
 * @version 2013-10-16
 */
public class IpUtil {

    public static String getIpAddress() {
        try {
            return java.net.InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "127.0.0.1";
    }
}
