public class AbstractFactory {

  public VeiculoFactory getFactory(String tipoVeiculo) {
    VeiculoFactory veiculoFactory;
    if (tipoVeiculo.equalsIgnoreCase("carro"))
    {
        veiculoFactory = new BlackFactory(); 
    }
    else if (tipoVeiculo.equalsIgnoreCase("moto")) 
    {
        veiculoFactory = new WhiteFactory();
    } 
    else if (tipoVeiculo.equalsIgnoreCase("caminhao"))
    {
      veiculoFactory = new WhiteFactory();
    }
    return veiculoFactory;
  }
}
