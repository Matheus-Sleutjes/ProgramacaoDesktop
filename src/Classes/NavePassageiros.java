package Classes;
public class NavePassageiros extends NaveEspacial {
    public NavePassageiros(String nome) {
        super(nome);
        this.NumeroPassageiros = 0;
    }
    private int NumeroPassageiros;

    public void setNumeroPassageiro(int novoNumeroPassageiros){
        this.NumeroPassageiros = novoNumeroPassageiros;
    }

    public int getNumeroPassageiros(){
        return this.NumeroPassageiros;
    }

    // @Override
    // public String ToString(){
    //     return  "Nome: "+this.Nome+","+
    //             "Velociade: "+Double.toString(this.VelocidadeMaxima)+","+
    //             "Numero Tripulantes: "+Integer.toString(this.NumeroTripulantes)+","+
    //             "Combustivel: "+Double.toString(this.Combustivel)+","+
    //             "Numero de passageiros: "+Integer.toString(this.NumeroPassageiros);
    // }
}
