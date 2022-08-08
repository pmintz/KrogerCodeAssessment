import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class New {
    HashMap<Character, Integer> map = new HashMap<>();
    boolean solution(String sequence) {
        int a =0, b=0, c=0, d=0, e=0, f=0;
        for(char ch : sequence.toCharArray()){
            if(ch == '('){
                map.put(ch, a++);
            }
            if(c == '{'){
                map.put(ch, b++);
            }
            if(c == '['){
                map.put(ch, c++);
            }
            if(c == ')'){
                map.put(ch,d++ );
            }
            if(c == '}'){
                map.put(ch,e++ );
            }
            if(c == '}'){
                map.put(ch,f++ );
            }
            if (map.get('(') - map.get(')') != 0)
                return false;
            if (map.get('{') - map.get('}') != 0)
                return false;
            if (map.get('[') - map.get(']') != 0)
                return false;
            return true;
        }


    return false;
    }

}
