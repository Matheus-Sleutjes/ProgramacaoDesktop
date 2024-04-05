public class Assento
{
    private String Cor;

    public String toString(){
        return ("A cor do banco é"+ this.Cor);
    }

    public void setAssento(String cor){
        this.Cor = cor;
    }

    public String getAssento(){
        return this.Cor;
    }
}