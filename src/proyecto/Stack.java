package proyecto;

/**
 * Created by alber on 19/09/2016.
 */
public interface Stack<E> {

    public void push(E elementos) throws PilaLlena;
    public E pop() throws PilaVacia;
    public int size();
}
