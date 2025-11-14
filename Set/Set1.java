package DataStructure.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set1 {

    public static void main(String[] args){
        List<String> names = Arrays.asList("Apple","Bat","Cat", "Dog", "Apple", "Cat");
        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println("Unique Names: " + uniqueNames);
    }
}
