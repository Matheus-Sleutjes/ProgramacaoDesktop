public class MotorCombustao extends Motor implements IMotor
{
    @Override
    public String toString(){
        return ("Tem "+this.Cavalos.toString()+" cavalos de potencia, e é raiz");
    }
}