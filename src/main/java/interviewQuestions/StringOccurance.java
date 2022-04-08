package interviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class StringOccurance

{
    public static void main (String[] args)
    {
        String s="sagar";

        String [] c =s.split("");
        for (String p: c
             ) {
            System.out.print(p);

        }
        //List
        List<String> str = Arrays.asList(s.split(""));
        //str.stream().map(Function.identity(),).forEach(System.out::println);

        Map<Integer, String> map = new HashMap<>();
        map.put(10, "Ten");
        map.put(100, "Hundred");
        map.put(1000, "Thousand");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }



}
