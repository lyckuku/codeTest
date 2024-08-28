package com.example.statepattern;

/**
 * 策略接口
 *
 * @author 罗勇春
 * @version 3.0.0
 * @since 2024/8/28
 */
public interface Strategy {
    String processSequence(char currentChar, int count);
}
