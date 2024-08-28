package com.example.statepattern;

/**
 * 状态接口
 *
 * @author 罗勇春
 * @version 1.0.0
 * @since 2024/8/28
 */
public interface State {
    String handle(String input, Context context);
}
