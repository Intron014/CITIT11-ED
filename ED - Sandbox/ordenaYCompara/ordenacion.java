import java.util.Iterator;
import java.util.LinkedList;

public class ordenacion {
    public static void main(String[] args){
        LinkedList<Integer> lista1 = new LinkedList<Integer>();
        //If only I knew how to make the system read input...
        lista1.add(1); lista1.add(2); lista1.add(3); lista1.add(4); lista1.add(5); lista1.add(6); lista1.add(7);
        LinkedList<Integer> lista2 = new LinkedList<Integer>();
        lista2.add(1); lista2.add(3); lista2.add(5); lista2.add(7);
        Iterator<Integer> it1 = lista1.listIterator();

        System.out.printf("Items comunes: ");
        while(it1.hasNext()){
            Integer one = it1.next();
            if(lista2.contains(one)){
                System.out.printf(String.valueOf(one));
                System.out.printf(" ");
            }
            }
        }

    }
