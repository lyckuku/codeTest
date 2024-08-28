package com.example.statepattern;

/**
 * 删除策略
 *
 * @author 罗勇春
 * @version 3.0.0
 * @since 2024/8/28
 */
public class DeleteStrategy implements Strategy {
    @Override
    public String processSequence(char currentChar, int count) {
        // 如果连续字符达到3个或更多，则返回空字符串
        return count >= 3 ? "" : StringUtils.repeatChar(currentChar, count);
    }

}
