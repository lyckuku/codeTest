package com.example.statepattern;

/**
 * 状态移除
 *
 * @author 罗勇春
 * @version 3.0.0
 * @since 2024/8/28
 */
public class ProcessingState implements State {
    @Override
    public String handle(String input, Context context) {StringBuilder result = new StringBuilder();
        int length = input.length();
        int count = 1;

        for (int i = 0; i < length; i++) {
            if (i < length - 1 && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                result.append(context.getStrategy().processSequence(input.charAt(i), count));
                count = 1;
            }
        }

        context.setState(new NormalState());
        return result.toString();
    }
}
