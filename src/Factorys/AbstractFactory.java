public class AbstractFactory {

  public VeiculoFactory getFactory(String tipoVeiculo) {
    VeiculoFactory veiculoFactory;
    if (tipoVeiculo.equalsIgnoreCase("carro"))
    {
        veiculoFactory = new FabricaCarro(); 
    }
    else if (tipoVeiculo.equalsIgnoreCase("moto")) 
    {
        veiculoFactory = new FabricaMoto();
    } 
    else if (tipoVeiculo.equalsIgnoreCase("caminhao"))
    {
      veiculoFactory = new FabricaCaminhao();
    }
    return veiculoFactory;
  }
}
