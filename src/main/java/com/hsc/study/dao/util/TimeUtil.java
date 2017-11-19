package com.hsc.study.dao.util;

/**
 * Created by apple on 17/11/19.
 */
public class TimeUtil {
    public static int getNowSeconds() {
        return (int) (System.currentTimeMillis() / 1000);
    }
}
