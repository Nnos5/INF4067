public class TestSingleton {
    public static void main(String[] args){


        int som1 = OperationMathematique.getInstance().somme(2, 5);        
        System.out.println("la somme avec deux parametre est "+som1);

        int som2 = OperationMathematique.getInstance().somme(2, 5, 8);
        System.out.println("la somme avec trois parametre est "+som2);

        OperationMathematique s1 = OperationMathematique.getInstance(8, 3, 1);
        s1.affiche();

        OperationMathematique s2 = OperationMathematique.getInstance(5, 9, 13);
        s2.affiche();
    }
}
