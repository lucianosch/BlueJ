import java.util.*;
public class OrdinaPeso implements Comparator<Persona>
{
    public int compare(Persona p1, Persona p2)
    {
        return (int)(p1.getPeso()-p2.getPeso());
    }
}
