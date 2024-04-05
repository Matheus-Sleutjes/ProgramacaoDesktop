public class Roda
{
    private String Marca;

    public String toString(){
        return ("O pneu é da"+ this.Marca);
    }

    public void setRoda(String marca){
        this.Marca = marca;
    }

    public String getRoda(){
        return this.Marca;
    }
}