
public class printsubstring {

    static int count = 0; // Initialize a counter variable

    public static void substring(String str, String ans, int idx) {
        if (idx == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
                count++; // Increment the counter when a substring is printed
            }
            return;
        }
        // Yes condition
        substring(str, ans + str.charAt(idx), idx + 1);
        // No condition
        substring(str, ans, idx + 1);
    }

    public static void main(String args[]) {
        String str = "KRITI";
        substring(str, "", 0);
        System.out.println("Total number of substrings: " + (count+1)); // Print the total count
    }
}


/*public class printsubstring {
    
public static void substring(String str, String ans, int idx){
    if(idx == str.length()){
        if(ans.length() == 0){
            System.out.println("null");
        }else{
        System.out.println(ans);
    }
    return;
}
    //yes condition
    substring(str, ans +str.charAt(idx)  , idx+1);
    //no condition
    substring(str, ans, idx +1);
}
public static void main(String args[]){
    String str ="KAR";
    substring(str, "", 0);
    /*int count = countSubstrCombinations(str);
    int combinations = countSubstrCombinations(str);
        System.out.println("Number of substring combinations: " + combinations); 
}
private static int countSubstrCombinations(String str) {
    String strr ="KAR";
    int combinations = countSubstrCombinations(strr);
      //  System.out.println("Number of substring combinations: " + combinations); 

    return combinations;
    }
}
}*/



