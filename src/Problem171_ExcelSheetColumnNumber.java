public class Problem171_ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int count = 1;
        int result = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            int num = columnTitle.charAt(i) - 'A' + 1;
            result = result + (num * count);
            count = count * 26;
        }
        return result;
    }
}
