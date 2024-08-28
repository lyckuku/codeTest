package com.example.statepattern.test;

import com.example.statepattern.Context;
import com.example.statepattern.DeleteStrategy;
import com.example.statepattern.ReplaceStrategy;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 重复元素移除测试
 *
 * @author 罗勇春
 * @version 3.0.0
 * @since 2024/8/28
 */
public class RemoveConsecutiveCharsTest {

    @Test
    public void testDeleteStrategy() {
        Context deleteContext = new Context(new DeleteStrategy());
        String input = "aabccccbbad";
        String expected = "d";
        assertEquals(expected, deleteContext.process(input));
    }

    @Test
    public void testReplaceStrategy() {
        Context replaceContext = new Context(new ReplaceStrategy());
        String input = "abcccbad";
        String expected = "d";
//        System.out.println(replaceContext.process(input));
        assertEquals(expected, replaceContext.process(input));
    }

    @Test
    public void testMixedReplaceStrategy() {
        Context replaceContext = new Context(new ReplaceStrategy());
        String input = "aaabbbcccaaa";
        String expected = "``a";
        assertEquals(expected, replaceContext.process(input));
    }

    @Test
    public void testMixedDeleteStrategy() {
        Context deleteContext = new Context(new DeleteStrategy());
        String input = "aaabbbcccaaa";
        String expected = "";
        assertEquals(expected, deleteContext.process(input));
    }

    @Test
    public void testSingleChar() {
        Context deleteContext = new Context(new DeleteStrategy());
        String input = "a";
        String expected = "a";
        assertEquals(expected, deleteContext.process(input));
    }

    @Test
    public void testEmptyString() {
        Context deleteContext = new Context(new DeleteStrategy());
        String input = "";
        String expected = "";
        assertEquals(expected, deleteContext.process(input));
    }


}
