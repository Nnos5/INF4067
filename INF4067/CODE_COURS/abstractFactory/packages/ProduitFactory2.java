package packages;

public class ProduitFactory2 implements IProduitFactory {
    public ProduitA getProduitA() {
    return new ProduitA2();
    }

    public ProduitB getProduitB() {
        return new ProduitB2();
    }
    
}