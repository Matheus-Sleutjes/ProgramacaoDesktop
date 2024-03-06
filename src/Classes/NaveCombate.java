package Classes;
public class NaveCombate extends NaveEspacial {
    public NaveCombate(String nome) {
        super(nome);
        this.Armamento = "";
    }
    private String Armamento;

    public void setArmamento(String novaArmamento){
        this.Armamento = novaArmamento;
    }

    public String getArmamento(){
        return this.Armamento;
    }

    public String atacar(){
        return "Atacando!";
    }

    // @Override
    // public String ToString(){
    //     return "Nome: "+this.Nome+","+
    //             "Velociade: "+Double.toString(this.VelocidadeMaxima)+","+
    //             "Numero Tripulantes: "+Integer.toString(this.NumeroTripulantes)+","+
    //             "Combustivel: "+Double.toString(this.Combustivel)+","+
    //             "Armamento: "+this.Armamento;
    // }
}
