public  VeiculoFactory {
    public BaseFactory getFactory(String color) {
        BaseFactory baseFactory;
        if (color.equalsIgnoreCase("black"))
            baseFactory = new BlackFactory();
        else if (color.equalsIgnoreCase("white")) {
            baseFactory = new WhiteFactory();
        }
        return baseFactory;
    }
}