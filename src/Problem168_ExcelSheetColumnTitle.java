public class Problem168_ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder s=new StringBuilder();
        while(columnNumber>26){
            int remainder=columnNumber%26;
            columnNumber=columnNumber/26;
            if(remainder==0){
                s.append('Z');
                columnNumber--;
            }else{
                s.append((char)('A'+(remainder-1)));
            }
        }
        s.append((char)('A'+(columnNumber-1)));
        return s.reverse().toString();
    }
}
