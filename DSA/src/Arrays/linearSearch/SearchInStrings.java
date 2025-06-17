package Arrays.linearSearch;

import java.util.*;

public class SearchInStrings {
    public static void main(String[] args) {
        String name= "amira";
        char target = 'z';
        System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    public static  boolean search(String name , char target ){
        if (name.length() == 0){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == target){
                return true;
            }
        }

        // same but with for each
        for (char ch: name.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
}
