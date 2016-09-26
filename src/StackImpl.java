package proyecto;

public class StackImpl<E> implements Stack<E> {
    int size = 0;
    E[] elements;
    int lon=0;

    public StackImpl(int len) {
        this.elements = (E[]) new Object[len];
        this.lon=len;
    }
    public int size() {
        return this.size;
    }
    public void push(E e) throws PilaLlena {

        if (size>=lon){
            throw new PilaLlena();
        }
        else {
            this.elements[size] = e;
            this.size++;
        }
    }
    public E pop() throws PilaVacia {
        if (size==0){
            throw new PilaVacia();
        }
        else {
            size--;
            return this.elements[size];
        }
    }
}
