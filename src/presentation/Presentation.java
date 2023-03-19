package presentation;

import dao.DaoNSQL;
import metier.MetierImpl;
public class Presentation {
    public static void main(String[] args){
        MetierImpl metier = new MetierImpl();
        DaoNSQL nosql = new DaoNSQL();
        metier.setDao(nosql);
        double resultat = metier.calcul();
        System.out.println("Résultat est :"+ resultat);
    }

}
