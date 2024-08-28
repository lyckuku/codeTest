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
                    if (start == 0) {
                        // 前面没有字符可以替换时，直接删除这些字符
                        result.delete(start, i);
                    } else {
                        // 替换为前一个字母
                        char newChar = (char) (currentChar - 1);
                        result.replace(start, i, String.valueOf(newChar));
                    }

                    changed = true;
                    break;
                }
            }
        }
        return result.toString();
    }
}