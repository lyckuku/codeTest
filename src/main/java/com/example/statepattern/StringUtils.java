package com.example.statepattern;

/**
 * 字符串处理工具类
 *
 * @author 罗勇春
 * @version 3.0.0
 * @since 2024/8/28
 */
public class StringUtils {
    public static String repeatChar(char c, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(c);
        }
        return sb.toString();
    }
}
