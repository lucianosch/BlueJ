import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Persona implements Comparable
{
    // variabili d'istanza - sostituisci l'esempio che segue con il tuo
    private String nome;
    private int eta;
    private double peso;
    private Calendar dataNascita;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Persona(String nome, double peso, String dataN)
    {
        // inizializza le variabili d'istanza
        this.nome = nome;
        this.peso = peso;
        this.dataNascita = Calendar.getInstance();
        try
        {
            dataNascita.setTime(sdf.parse(dataN)); 
	} 
	catch (java.text.ParseException e){ e.printStackTrace(); }
	long diff = Calendar.getInstance().getTimeInMillis() - dataNascita.getTimeInMillis();
	eta = (int)(diff/(1000*60*60*24));
	eta = eta/365;
    }
    public int getEta()
    {
        return eta;
    }
    public String getNome()
    {
        return nome;
    }
    public double getPeso()
    {
        return peso;
    }
    public String getDataNascita()
    {
        return sdf.format(dataNascita.getTime());
    }
    public int compareTo(Object p)
    {
        return nome.compareTo(((Persona)p).getNome());
    }
    public String toString()
    {
        return nome+": "+eta+" anni, peso: "+peso;
    }
}
