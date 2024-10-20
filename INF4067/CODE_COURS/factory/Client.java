import packages.*;

public class Client {
    public static void main(String[] args) {
        ProduitFactory produitFactory1 = new ProduitFactory1();
        ProduitFactory produitFactory2 = new ProduitFactory2();
        ProduitFactory produitFactory3 = new ProduitFactory3();

        ProduitA produitA = null;

        System.out.println("Utilisation de la premiere fabrique");
        produitA = produitFactory1.getProduitA();
        produitA.methodeA();


        System.out.println("Utilisation de la deuxieme fabrique");
        produitA = produitFactory2.getProduitA();
        produitA.methodeA();


        System.out.println("Utilisation de la troisieme fabrique");
        produitA = produitFactory3.getProduitA();
        produitA.methodeA();


    }
}
