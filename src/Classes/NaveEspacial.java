package Classes;
public abstract class NaveEspacial {
    private String Nome;
    private double VelocidadeMaxima;
    private int NumeroTripulantes;
    private double Combustivel;

    public NaveEspacial(String nome) {
        this.Nome = nome;
        this.VelocidadeMaxima = 0;
        this.NumeroTripulantes = 0;
        this.Combustivel = 0;
    }

    public void setNome(String novoNome) {
        this.Nome = novoNome;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setVelocidade(double novaVelocidade) {
        this.VelocidadeMaxima = novaVelocidade;
    }

    public double getVelocidadeMaxima() {
        return this.VelocidadeMaxima;
    }

    public void setTripulantes(int novaTripulacao){
        this.NumeroTripulantes = novaTripulacao;
    }

    public int getTripulantes(){
        return this.NumeroTripulantes;
    }

    public void setCombustivel(double novoCombustivel) {
        this.Combustivel = novoCombustivel;
    }

    public double getCombustivel() {
        return this.Combustivel;
    }

    public void acelerar(double acelerar){
        if(acelerar < 0)
        System.out.println("Não é possivel acelerar negativo");
        else
        this.VelocidadeMaxima += acelerar;
    }

    public void desacelerar(double desacelerar){
        if(this.VelocidadeMaxima < desacelerar)
        System.out.println("Não foi possivel desacelerar essa velociada");
        else
        this.VelocidadeMaxima -= desacelerar;
    }

    public void abastecer(double litros){
        this.Combustivel += litros;
    }

    public void viajar(double distancia){
        if(this.Combustivel < distancia)
        System.out.println("Não tem combustivel suficiente para viagem");
        else
        this.Combustivel -= distancia;
    }

    public String ToString(){
        // return "Nome: "+this.Nome+","+
        //         "Velociade: "+Double.toString(this.VelocidadeMaxima)+","+
        //         "Numero Tripulantes: "+Integer.toString(this.NumeroTripulantes)+","+
        //         "Combustivel: "+Double.toString(this.Combustivel)+",";
        return "objeto";
    }
}
