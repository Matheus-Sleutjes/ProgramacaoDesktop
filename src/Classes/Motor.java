public class Motor
{
    private int Cavalos;

    public String toString(){
        return ("Tem "+this.Cavalos.toString()+" cavalos de potencia");
    }

    public void setMotor(int cavalos){
        this.Cavalos = cavalos;
    }

    public int getMotor(){
        return this.Cavalos;
    }
}