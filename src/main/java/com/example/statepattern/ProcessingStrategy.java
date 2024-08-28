package com.example.statepattern;

/**
 * 策略接口
 *
 * @author 罗勇春
 * @version 3.0.0
 * @since 2024/8/28
 */
public interface ProcessingStrategy {
    /**
     * 字符串转换
     *
     * @param input 需要转换的字符串
     * @param start 开始位置
     * @param end 结束结束位置
     * @param currentChar  当前字符
     * @return
     */
    String processConsecutiveChars(StringBuilder input, int start, int end, char currentChar);

}
