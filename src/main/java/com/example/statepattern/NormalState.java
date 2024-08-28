package com.example.statepattern;

/**
 * 状态保留
 *
 * @author 罗勇春
 * @version 3.0.0
 * @since 2024/8/28
 */
public class NormalState implements State {

    @Override
    public String handle(String input, Context context) {
        int length = input.length();
        int count = 1;

        for (int i = 1; i < length; i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
                if (count >= 3) {
                    context.setState(new ProcessingState());
                    return context.getState().handle(input, context);
                }
            } else {
                count = 1;
            }
        }

        return input;
    }
}
