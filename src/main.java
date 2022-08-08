import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class main {

    public static void main(String [] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);

        String line ="011212201220200112";

        char[] chArr = line.toCharArray();

        List<Character> chList = new ArrayList<Character>();
        List<Character> chListCopy = new ArrayList<Character>();

        for (char c : chArr) {
            chList.add(c);
        }

        for (char c : chArr) {
            chListCopy.add(c);
        }

        int input =  Integer.parseInt(in.readLine());
        int counter = 0;

        if(input <= 17) {
            System.out.println(line.charAt(input));
        }else if((input % 17) == 0 ) {
            counter = input / 17;
        }else{
            counter = (input / 17) + 1;
        }

       for(int a = counter; counter > 0; counter--) {
           chList.add('0');
           for (char c: chListCopy) {
               if (c == 0) {
                   chList.add('1');
               } else if (c == 1) {
                   chList.add('2');
               } else {
                   chList.add('0');
               }

           }
       }

       //System.out.println(chList.toString());
       System.out.println(chList.get(input));

    }
}
