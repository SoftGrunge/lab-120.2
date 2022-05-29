package university;

import java.util.Arrays;
//Efimov D. A.
public class Main {
    public static void main(String[] args) {
        StringService serv = new StringService();
        char[] chArray = serv.getCharStat("Country capitals");
        String[] stringArray = {"Bern", "Damascus", "Skopje", "Luxembourg", "Stockholm", "Bangkok"};


        System.out.println(Arrays.toString(chArray));
        System.out.println();



        try {
            stringArray = serv.sort(stringArray, true);
        }catch (StringArrayException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("In order");
        System.out.println(Arrays.toString(stringArray));

        try {
            stringArray = serv.sort(stringArray, false);
        } catch (StringArrayException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("In reverse order ");
        System.out.println(Arrays.toString(stringArray));




    }
}