//实现一个MyQueue类，该类用两个栈来实现一个队列。
//示例：
//MyQueue queue = new MyQueue();
//
//queue.push(1);
//queue.push(2);
//queue.peek();  // 返回 1
//queue.pop();   // 返回 1
//queue.empty(); // 返回 false

package leetcode.Queue_Stack;

import java.util.Stack;

 class MyQueue{
     Stack s1 ;
     Stack s2 ;
    /** Initialize your data structure here. */
    public MyQueue() {
        s1 = new Stack();
        s2 = new Stack();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.add(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(!s1.isEmpty()){
            s2.add(s1.pop());
        }
        Object temp = s2.pop();
        while(!s2.isEmpty()){
            s1.add(s2.pop());
        }
        return (int)temp;
    }
    
    /** Get the front element. */
    public int peek() {
        while(!s1.isEmpty()){
            s2.add(s1.pop());
        }
        Object temp = s2.peek();
        while(!s2.isEmpty()){
            s1.add(s2.pop());
        }
        return (int)temp;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(s1.isEmpty() && s2.isEmpty())
            return true;
        else
            return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */