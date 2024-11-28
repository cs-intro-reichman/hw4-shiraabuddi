public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        String newstring = "";
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i)>64) && (str.charAt(i)<91)){
                newstring += (char)(str.charAt(i)+32);
            }
            else{
                newstring += str.charAt(i);
            }
            
        }
        return newstring;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        String newstr1 = lowerCase(str1);
        String newstr2 = lowerCase(str2);
        int counter =0;

        if (newstr1.length() < newstr2.length()){
            return false;
        }
        for (int i = 0; i < newstr2.length(); i++) {
            for (int j = 0; j < newstr1.length(); j++) {
                if (newstr2.charAt(i) == newstr1.charAt(j)){
                    counter++;
                    break;
                }
                else{
                    if (j == newstr1.length()){
                        counter = 0;
                    }
                }   
            }
            if(counter == newstr2.length()){
                return  true;
            }
            
        }

        return false;
    }
}
