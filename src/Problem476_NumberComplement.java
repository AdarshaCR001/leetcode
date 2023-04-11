public class Problem476_NumberComplement {
    public int findComplement(int num) {
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(num % 2 == 1 ? 0 : 1);
            num = num / 2;
        }
        return Integer.parseInt(sb.reverse().toString(), 2);
    }
}
