package deqo.mran.mysimplestack;

import java.util.EmptyStackException;
import java.util.Stack;

public class SimpleStackImpl implements SimpleStack {

    private Stack<Object> wrapperStack = new Stack<>();

    public boolean isEmpty(){
        return wrapperStack.isEmpty();
    }

    public int getSize(){
        return wrapperStack.size();
    }

    public void push(Item item){
        wrapperStack.push(item);
    }

    public Item peek() throws EmptyStackException {
        return (Item) wrapperStack.peek();
    }

    public Item pop() throws EmptyStackException{
        return (Item) wrapperStack.pop();
    }
}