package packages;

public class ProduitFactory3 extends ProduitFactory {
    
    protected ProduitA createProduitA(){
        return new ProduitA3();
    }
}
