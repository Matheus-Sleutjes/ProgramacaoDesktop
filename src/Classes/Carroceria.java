public class Carroceria
{
    private String Cor;

    public String toString(){
        return ("A cor da carroceria é "+ this.Cor);
    }

    public void setCarroceria(String cor){
        this.Cor = cor;
    }

    public String getCarroceria(){
        return this.Cor;
    }
}