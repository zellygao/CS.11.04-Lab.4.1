public class Main {

    // 1. parenthesesCheck
     static boolean parenthesesCheck (String str){
        if(str.charAt(0) == '(' && str.charAt(str.length()-1) == ')'){
            return true;
        }
        return false;
    }

    // 2. reverseInteger
    static String reverseInteger (int str){
         String result = "";
         String actual = str + "";
         for(int i=actual.length()-1; i>-1; i--){
             result+= actual.charAt(i);
         }
         return result;
    }
    // 3. encryptThis

    static String encryptThis(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && str.charAt(i - 1) == ' ' || i == 0) {
                int endIndex = str.indexOf(' ',i); // find the first occurance of '' starting at i
                if (endIndex == -1) {
                    endIndex = str.length();
                }

                String word = str.substring(i, endIndex);

                if(word.length()==3){
                    result+= (int) str.charAt(i);
                    result+=word.charAt(i+2);
                    result+=word.charAt(i+1);
                }
                else if(word.length()==2){
                    result+=(int) str.charAt(i);
                    result+= word.charAt(i+1);
                }
                else if(word.length()==1){
                    result+=(int) str.charAt(i);
                }
                else if (word.length()>3){
                    result += (int) str.charAt(i);
                    result += word.charAt(word.length() - 1);
                    result += word.substring(2, word.length() - 1);
                    result += word.charAt(1) + " ";
                }

                i = endIndex; // Skip to the next word
            }
        }
        return result.stripTrailing();
    }

    // 4. decipherThis
    static String decipherThis (String str){
         String result = "";
         int start = 0;
         for (int i = 0;i<str.length();i++){
              if (i > 0 && str.charAt(i - 1) == ' ' || i == 0) {
                 int endIndex = str.indexOf(" ",i);
                 String word = str.substring(i,endIndex);
                 for(int n = 0; n<word.length(); n++){
                     if(Character.isDigit(word.charAt(n)) != true){
                        start = n;
                     }
                 }
                 result+= (char) word.substring(0,start);
                 result+=word.charAt(endIndex);
                 result+=word.substring(1,endIndex);
                 result+=word.charAt(1);


                 result+=word.charAt(0);
                 result+=word.charAt(word.length()-1);
                 result+=word.substring(2, endIndex-1);
                 result+=word.charAt(1);
             }
         }
         return result;
    }


}