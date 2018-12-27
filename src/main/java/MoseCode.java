import java.util.*;

public class MoseCode {
    private String[] codes = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    private HashMap<Character, String> mapping = new HashMap<Character, String>() {
        {
            for (int i = 0; i < codes.length; i++) {
                put((char) ('a' + i), codes[i]);
            }
        }
    };


    public int diffResult(String[] words) {
        if (words.length == 0)
            return 0;

        List<String> tempList = new ArrayList<>();
        for (String word : words
        ) {
            String codeString = replaceStrToCode(word);
            if (!tempList.contains(codeString))
                tempList.add(codeString);
        }
        return tempList.size();
    }

    private String replaceStrToCode(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            sb.append(mapping.get(str.charAt(i)));
        }
        return sb.toString();
    }
}
