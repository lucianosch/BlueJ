import java.util.*;
public class GestPersona
{
    public static void main(String args[])
    {
        ArrayList<Persona> t = new ArrayList();
        t.add(new Persona("Giulio",78.3,"1/1/1980"));
        t.add(new Persona("Anna",53.7,"1/1/1990"));
        t.add(new Persona("Francesco",71.2,"1/9/2001"));
        System.out.println("Ordine di inserimento:");
        for (Object p : t)
            System.out.println(p.toString());
        System.out.println("Ordine di inserimento con ListIterator:");
        ListIterator lit = t.listIterator();
        while (lit.hasNext())
            System.out.println(lit.next());
        System.out.println("Ordine di inserimento inverso:");
        lit = t.listIterator(t.size());
        while (lit.hasPrevious())
            System.out.println(lit.previous());
        Collections.sort(t);
        System.out.println("Ordinati per nome:");
        for (Object p : t)
            System.out.println(p.toString());
        System.out.println("Ordinati per età:");
        //Collections.sort(t,new OrdinaEta());
        t.sort(new OrdinaEta());
        for (Object p : t)
            System.out.println(p.toString());
        System.out.println("Ordinati per età decrescente:");
        t.sort(Collections.reverseOrder(new OrdinaEta()));
        for (Object p : t)
            System.out.println(p.toString());
        System.out.println("Ordinati per peso:");
        Collections.sort(t,new OrdinaPeso());
        for (Object p : t)
            System.out.println(p.toString());
    }
}
