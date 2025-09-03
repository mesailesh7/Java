import java.util.*;

public class Stars {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        // for (int j = 0; j <= 5; j++) {
        // String star = " ";
        // for (int k = 1; k <= 5 - j; k++) {
        // star += " ";
        // }
        // for (int l = 0; l <= j; j++) {
        // star += " *";
        // }
        // System.out.println(star);
        // }
        // System.out.println("Hello world!");

        List<Integer> arr = new ArrayList<>();
//        int[] arr1 = { 'a','b','c'};
//
//        for(int i =0; i < arr.size(); i++){
//            System.out.println(arr.get(i));
//        }


        Map<String,Integer> marks = new HashMap<>();
        marks.put("rahul", 100);
        marks.put("simmy", 200);

        for(Map.Entry<String,Integer> entry: marks.entrySet())
        {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("----------------");
        }

        System.out.println(marks.get("rohit"));

        Optional<Integer> marksOfRohit = Optional.ofNullable(marks.get("rohit"));
        if(marksOfRohit.isPresent())
        {
            System.out.println(marksOfRohit.get());
        }
        else {
            System.out.println("I am not present");
        }










        Set<String> uniqeNames = new HashSet<>();
        uniqeNames.add("rahul");
        uniqeNames.add("simmy");
        uniqeNames.add("rahul");
        uniqeNames.add("simmy");
        uniqeNames.add("simmy");
        uniqeNames.add("simmy");

        System.out.println(uniqeNames);
        System.out.println(uniqeNames.size());
        System.out.println(uniqeNames.contains("simmy"));

        uniqeNames.remove("simmy");
        System.out.println(uniqeNames);






    }

}
