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

    @Override
    public String ToString(){
        return super.ToString()+
                "Armamento: "+this.Armamento;
    }
}
