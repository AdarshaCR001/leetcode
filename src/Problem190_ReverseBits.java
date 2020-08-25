public class Problem190_ReverseBits {
    public int reverseBits(int n) {
        StringBuilder  s=new StringBuilder(String.format("%32s",Integer.toBinaryString(n)).replaceAll(" ","0"));

        s=s.reverse();
        return (int)Long.parseLong(s.toString(),2);
    }
}
