import java.util.*;
public class OrdinaEta implements Comparator<Persona>
{
    public int compare(Persona p1, Persona p2)
    {
        return p1.getEta()-p2.getEta();
    }
}
