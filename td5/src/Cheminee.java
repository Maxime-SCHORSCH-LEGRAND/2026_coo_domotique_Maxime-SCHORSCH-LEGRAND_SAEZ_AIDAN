
public class Cheminee {

    int intensite;

    public Cheminee()
    {
        this.intensite=0;
    }

    public void changerIntensite(int i)
    {
        if (i>=0&&i<=100)
            this.intensite=i;
    }

    public int getLumiere()
    {
        return this.intensite;
    }

    public String toString()
    {
        return("cheminee: "+intensite);
    }
}