package com.projectTodo.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Yan liang
 * @create 2019/10/10
 * @since 1.0.0
 */
public class DateHelp {
    static Date DefaultDate;

    public static Date getDefaultDate() {
        if (DefaultDate == null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                DefaultDate = sdf.parse("1949-10-01 00:00:00");
            } catch (ParseException e) {
                MyLogger.logger.error("时间转换异常", e);
            }
        }
        return DefaultDate;
    }
}
