package com.example.statepattern;

/**
 * 字符串替换策略
 *
 * @author 罗勇春
 * @version 3.0.0
 * @since 2024/8/28
 */

public class RemoveStrategy implements ProcessingStrategy {

    @Override
    public String processConsecutiveChars(StringBuilder input, int start, int end, char currentChar) {
        input.delete(start, end);
        return input.toString();
    }
}