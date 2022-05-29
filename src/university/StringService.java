package university;
import java.util.Arrays;
import java.util.Comparator;

public class StringService {

    public static String[] sort(String[] as, boolean dir) throws StringArrayException {

        if (as == null || as.length == 0) {
            throw new StringArrayException("Incorrect array");
        }
        if (dir == true) {
            for (int j = 0; j < as.length; j++) {
                for (int i = j + 1; i < as.length; i++) {
                    if (as[i].compareTo(as[j]) < 0) {
                        String tmp = as[j];
                        as[j] = as[i];
                        as[i] = tmp;
                    }
                }
            }

        } else {
            for(int j =0;j<as.length;j++){
                for(int i=j+1;i<as.length;i++){
                    if(as[i].compareTo(as[j])>0){
                        String tmp = as[j];
                        as[j]=as[i];
                        as[i]=tmp;
                    }
                }

            }

        }
        return as;
    }

    public static char[] getCharStat (String str){
        if(str == null) {
            return null;
        }
        if (str.trim().equals("")) {
            return new char[0];
        }
        String tmp = "";
        for (int i = 0; i < str.length(); i++){
            if (str.indexOf(str.charAt(i), i+1) == - 1){
                tmp = tmp + str.charAt(i);

            }

        }
        char[] array = tmp.toCharArray();

        return array;
    }
}