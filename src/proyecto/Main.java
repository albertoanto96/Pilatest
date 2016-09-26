package proyecto;

public class Main {

    public static void main(String[] args) throws PilaLlena,PilaVacia
    {
        Stack<Integer> st1 =new proyecto.StackImpl<Integer>(10);
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);
        st1.push(6);
        st1.push(7);
        st1.push(8);
        st1.push(9);
        st1.push(10);
        st1.push(11);
        int size= st1.size();
        System.out.print(size);
    }
}
