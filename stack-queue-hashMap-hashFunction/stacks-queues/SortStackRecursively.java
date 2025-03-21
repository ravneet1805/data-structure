// 2. Given a stack, sort its elements in ascending order using recursion.

import java.util.Stack;

class SortStackRecursively {
    static void sortedInsert(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || value > stack.peek()) {
            stack.push(value);
            return;
        }
        int temp = stack.pop();
        sortedInsert(stack, value);
        stack.push(temp);
    }

    static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack);
            sortedInsert(stack, temp);
        }
    }
}

