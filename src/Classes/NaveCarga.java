package Classes;
public class NaveCarga extends NaveEspacial {
    public NaveCarga(String nome) {
        super(nome);
        this.CapacidadeCarga = 0;
    }
    private double CapacidadeCarga;

    public void carrega(double novaCapacidadeCarga){
        this.CapacidadeCarga += novaCapacidadeCarga;
    }

    public void descarrega(double novaCapacidadeCarga){
        this.CapacidadeCarga -= novaCapacidadeCarga;
    }

    public double getCapacidadeCarga(){
        return this.CapacidadeCarga;
    }

    @Override
    public String ToString(){
        return super.ToString()+
                "Capacidade de Carga: "+Double.toString(this.CapacidadeCarga);
    }
}
