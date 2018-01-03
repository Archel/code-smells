package es.rachelcarmena.oo.abusers.smell1;

import java.util.Vector;

public class CoolStack {
    private Vector<Object> stack = new Vector<>();

    public void push(Object element) {
        stack.insertElementAt(element, 0);
    }

    public Object pop() {
        Object result = stack.firstElement();
        stack.removeElementAt(0);
        return result;
    }

    public Integer size() {
        return this.stack.size();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }
}
