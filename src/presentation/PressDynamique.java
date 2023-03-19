package presentation;

import metier.IMetier;

import java.lang.reflect.Method;
import java.util.Scanner;

public class PressDynamique {
    public static void main (String [] args) throws Exception {
        Scanner sc = new Scanner(new File("src/config.txt"));
        String dao = sc.nextLine();
        Classe clsDao = Classe.forName(dao);
        IDao objDao = (IDao)clsDao.newInstance();

        String metier = sc.nextLine();
        Class clsMetier = Class.forName(metier);
        IMetier objMetier = (IMetier)clsMetier.newInstance();

        Method method = clsMetier.getMethod("setDao", Idao.class);
        method.invoke(objMetier, objDao);
        System.out.println(objMetier, calcul());
    }
}
