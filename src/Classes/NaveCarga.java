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

    // @Override
    // public String ToString(){
    //     return "Nome: "+this.getNome()
    //             // "Velociade: "+this.getVelocidadeMaxima()","+
    //             // "Numero Tripulantes: "+this.getNumeroTripulantes()+","+
    //             // "Combustivel: "+this.getCombustivel()+","+
    //             // "Capacidade de Carga: "+this.getCapacidadeCarga()
    //             ;
    // }
}
