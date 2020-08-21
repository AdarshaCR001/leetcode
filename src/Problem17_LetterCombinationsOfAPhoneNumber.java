import java.util.ArrayList;
import java.util.List;

public class Problem17_LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> combination = new ArrayList();
        for (int i = 0; i < digits.length(); i++) {
            String s = "";
            switch (digits.charAt(i)) {
                case '2':
                    s = "abc";
                    break;
                case '3':
                    s = "def";
                    break;
                case '4':
                    s = "ghi";
                    break;
                case '5':
                    s = "jkl";
                    break;
                case '6':
                    s = "mno";
                    break;
                case '7':
                    s = "pqrs";
                    break;
                case '8':
                    s = "tuv";
                    break;
                case '9':
                    s = "wxyz";
                    break;
            }

            List<String> tempCombination = new ArrayList(combination);
            combination.clear();
            for (int j = 0; j < s.length(); j++) {
                if (tempCombination.isEmpty()) {
                    combination.add(String.valueOf(s.charAt(j)));
                } else {
                    for (int k = 0; k < tempCombination.size(); k++) {
                        String word = tempCombination.get(k) + String.valueOf(s.charAt(j));

                        combination.add(word);
                    }
                }
            }
        }
        return combination;
    }
}
