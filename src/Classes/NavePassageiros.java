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

    @Override
    public String ToString(){
        return super.ToString()+
                "Numero de passageiros: "+Integer.toString(this.NumeroPassageiros);
    }
}
