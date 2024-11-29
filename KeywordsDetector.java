public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        // Replace this comment with your code
        int counter = 0;
        String[] newsentences = new String[sentences.length];
        for (int i = 0; i < sentences.length; i++) {
            newsentences[i] = lowerCase(sentences[i]);
            
        }
        for (int i = 0; i < sentences.length; i++) {
            for (int j = 0; j < keywords.length; j++) {
                if(contains(newsentences[i], keywords[j])){
                    System.out.println(sentences[i]);
                    break;

                }
                
            }
        }


    }

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

    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        String newstr1 = lowerCase(str1);
        String newstr2 = lowerCase(str2);

        if (newstr1.length() < newstr2.length()){
            return false;
        }
        for (int i = 0; i < newstr2.length(); i++) {
            for (int j = 0; j < newstr1.length(); j++) {
                if (newstr2.charAt(i) == newstr1.charAt(j) && (j+str2.length()<str1.length())){
                    if (newstr2.equals(str1.substring(j, j+str2.length()))){
                        return true;
                    }
                }
            }
                
            
        }

        return false;
    }

}
