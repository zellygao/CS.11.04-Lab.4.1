public class Main {

    // 1. parenthesesCheck
    static boolean parenthesesCheck(String str) {
        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            return true;
        }
        return false;
    }

    // 2. reverseInteger
    static String reverseInteger(int str) {
        String result = "";
        String actual = str + "";
        for (int i = actual.length() - 1; i > -1; i--) {
            result += actual.charAt(i);
        }
        return result;
    }
    // 3. encryptThis

    static String encryptThis(String str) {
        int endIndex = 0;
        String word = "";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && str.charAt(i - 1) == ' ' || i == 0) {
                endIndex = str.indexOf(' ', i); // find the first occurance of '' starting at i
                if (endIndex == -1) {
                    word = str.substring(i);
                } else {
                    word = str.substring(i, endIndex);
                }
                result += encryptmehelper(word);
            }

        }
        return result.stripTrailing();
    }

    static String encryptmehelper(String word) {
        String result = "";
        if (word.length() >= 3) {
            result += (int) word.charAt(0);
            result += word.charAt(word.length() - 1);
            result += word.substring(2, word.length() - 1);
            result += word.charAt(1) + " ";
        } else if (word.length() == 2) {
            result += (int) word.charAt(0);
            result += word.charAt(1) + " ";
        } else if (word.length() == 1) {
            result += (int) word.charAt(0) + " ";
        }
        return result;
    }


    // 4. decipherThis
    static String decipherThis(String str) {
        int endIndex = 0;
        String word = "";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && str.charAt(i - 1) == ' ' || i == 0) {
                endIndex = str.indexOf(' ', i); // find the first occurance of '' starting at i
                if (endIndex == -1) {
                    word = str.substring(i);
                } else {
                    word = str.substring(i, endIndex);
                }
                result += decipherthishelper(word);
            }

        }
        return result.stripTrailing();
    }

    static String decipherthishelper(String word) {
        String result = "";
        int index = 0;
        for (int i = 0; i < word.length(); i++) {
            if (!(Character.isDigit(word.charAt(i)))) {
                index = i;
                break;
            }
        }

        if(word.substring(index).length()>=3){
            int rest = Integer.parseInt(word.substring(0, index));
            result += (char) rest;
            result += word.charAt(word.length() - 1);
            result += word.substring(index+1, word.length() - 1);
            result += word.charAt(index) + " ";
        }
        else if(word.substring(index).length()==2){
            int rest = Integer.parseInt(word.substring(0, index));
            result += (char) rest;
            result+=word.charAt(word.length()-1);
            result+=word.charAt(index) + " ";
        }
        else if(word.substring(index).length()==1){
            int rest = Integer.parseInt(word.substring(0, index));
            result += (char) rest;
            result+= word.charAt(index) + " ";
        }

        return result;
    }
}