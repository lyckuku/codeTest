package com.example.statepattern;

/**
 * 替换策略
 *
 * @author 罗勇春
 * @version 3.0.0
 * @since 2024/8/28
 */
public class ReplaceStrategy  implements  Strategy{
    @Override
    public String processSequence(char currentChar, int count) {
        // 如果连续字符达到3个或更多，则返回前一个字符
        if (count >= 3) {
            char replacementChar = (char) (currentChar - 1);

            return String.valueOf(replacementChar);
        } else {
            return StringUtils.repeatChar(currentChar,count);
        }
    }
}
