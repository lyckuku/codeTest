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
    public String process(String input) {
        StringBuilder result = new StringBuilder(input);
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < result.length() - 2; i++) {
                if (result.charAt(i) == result.charAt(i + 1) && result.charAt(i) == result.charAt(i + 2)) {
                    int start = i;
                    char currentChar = result.charAt(i);
                    while (i < result.length() && result.charAt(i) == currentChar) {
                        i++;
                    }
                    result.delete(start, i);
                    changed = true;
                    break;
                }
            }
        }
        return result.toString();
    }
}