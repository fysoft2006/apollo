package com.github.knightliao.apollo.utils.data;

import com.google.gson.Gson;

/**
 * Google Json工具
 * 
 * @author liaoqiqi
 * @version 2014-6-16
 */
public final class GsonUtils {

    private GsonUtils() {

    }

    /**
     * 
     * @param object
     * @return
     */
    public static String toJson(Object object) {

        Gson gson = new Gson();
        String json = gson.toJson(object);
        return json;
    }
}
