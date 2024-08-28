package com.example.statepattern;

/**
 * 字符串替换策略
 *
 * @author 罗勇春
 * @version 3.0.0
 * @since 2024/8/28
 */

public class ReplaceStrategy implements ProcessingStrategy {

    @Override
    public String processConsecutiveChars(StringBuilder input, int start, int end, char currentChar) {
        if (start == 0) {
            // 如果前面没有字符串了 删除
            input.delete(start, end);
        } else {
            // 替换为前一个字母
            char newChar = (char) (currentChar - 1);
            input.replace(start, end, String.valueOf(newChar));
        }
        return input.toString();
    }
}