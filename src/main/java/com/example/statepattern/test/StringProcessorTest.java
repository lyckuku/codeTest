package com.example.statepattern.test;

import com.example.statepattern.RemoveStrategy;
import com.example.statepattern.ReplaceStrategy;
import com.example.statepattern.SimpleStringProcessor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * 字符串测试
 *
 * @author 罗勇春
 * @version 3.0.0
 * @since 2024/8/28
 */

public class StringProcessorTest {

    /**
     * 连续字符串删除单元测试
     */

    @Test
    public void testRemoveStrategy() {
        RemoveStrategy removeStrategy = new RemoveStrategy();
        assertEquals("d", SimpleStringProcessor.processString("aabcccbbad",removeStrategy));
        assertEquals("abcd", SimpleStringProcessor.processString("abcd",removeStrategy));
        assertEquals("", SimpleStringProcessor.processString("aaa",removeStrategy));
        assertEquals("aa", SimpleStringProcessor.processString("aa",removeStrategy));
        assertEquals("a", SimpleStringProcessor.processString("a",removeStrategy));
    }

    /**
     * 连续字符串替换单元测试
     */
    @Test
    public void testReplaceStrategy() {
        ReplaceStrategy replaceStrategy = new ReplaceStrategy();

        assertEquals("d", SimpleStringProcessor.processString("abcccbad",replaceStrategy));
        assertEquals("abc", SimpleStringProcessor.processString("abc",replaceStrategy));
        assertEquals("", SimpleStringProcessor.processString("aaa",replaceStrategy));
        assertEquals("aa", SimpleStringProcessor.processString("aa",replaceStrategy));
    }
}
