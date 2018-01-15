package stack.Interface;

/**
 * Created by elaine on 1/10/2018.
 */
public interface IStack<T> {
    void push(T element) throws Exception;
    T pop() throws Exception;
    boolean isEmpty();
    int size();
}
