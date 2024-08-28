package com.example.statepattern.test;

import com.example.statepattern.RemoveStrategy;
import com.example.statepattern.ReplaceStrategy;
import com.example.statepattern.StringProcessor;
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
        StringProcessor processor = new StringProcessor(new RemoveStrategy());
        assertEquals("d", processor.process("aabcccbbad"));
        assertEquals("abcd", processor.process("abcd"));
        assertEquals("", processor.process("aaa"));
        assertEquals("aa", processor.process("aa"));
        assertEquals("a", processor.process("a"));
    }

    /**
     * 连续字符串替换单元测试
     */
    @Test
    public void testReplaceStrategy() {
        StringProcessor processor = new StringProcessor(new ReplaceStrategy());
        assertEquals("d", processor.process("abcccbad"));
        assertEquals("abc", processor.process("abc"));
        assertEquals("", processor.process("aaa"));
        assertEquals("aa", processor.process("aa"));
    }
}
