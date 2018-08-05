import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Common {


    // ici on suppose que la liste contient que des Integer vu l'exemple ds l'énnoncé
    public static List<List<Integer>> partition(List<Integer> liste, int taille){
        if( liste.isEmpty())
            return Collections.emptyList();

        if(taille <1)
            return Arrays.asList(liste);

        List<List<Integer>> rst = new ArrayList<List<Integer>>();
        List<Integer> part = new ArrayList<Integer>(taille);
        int compteur = 0 ;

        // parcourir elmt par elmt et
        // chaque taille elmts on crée un part et on l'ajoute au resultat
        for(Integer i: liste) {
            part.add(i);
            if (++compteur == taille) {
                //add part dans result
                rst.add(part);
                //create new part
                part = new ArrayList<Integer>(taille);
                compteur = 0;
            }
        }

        if(compteur>0)
            //ajout dernier part
            rst.add(part);

        return rst ;
    }
}
