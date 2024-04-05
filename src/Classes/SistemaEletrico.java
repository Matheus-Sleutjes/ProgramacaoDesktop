public class SistemaEletrico
{
    private String TipoFio;

    public String toString(){
        return ("O fio é de"+ this.TipoFio);
    }

    public void setSistemaEletrico(String tipoFio){
        this.TipoFio = tipoFio;
    }

    public String getSistemaEletrico(){
        return this.TipoFio;
    }
}