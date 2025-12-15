
public class Polymorphism {
    static boolean usrstrcmp(String s1, String s2){
        if(s1.length()!=s2.length()) return false;
        int n=s1.length();
        for(int i=0; i<n; i++){
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }

     static boolean usrstrcmp(String s1, String s2, int n){
        for(int i=0; i<n; i++){
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1="hello";
        String s2="hello ji";

        System.out.println("Compare Full String: " + usrstrcmp(s1, s2));
        System.out.println("Compare first n Characters: " + usrstrcmp(s1, s2, 5));
    }
}

