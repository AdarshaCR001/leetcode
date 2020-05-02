public class Problem1432_MaxDifferenceYouCanGetFromChangingAnInteger {
    public int maxDiff(int num) {

        String snum = String.valueOf(num);

        String changer1 = "";
        String changer2 = "";
        for (int i = 0; i < snum.length(); i++) {
            if (changer1 != "" && changer2 != "")
                break;
            if (snum.charAt(i) != '9' && changer1 == "") {
                changer1 = Character.toString(snum.charAt(i));
            }
            if ((snum.charAt(i) != '1' && snum.charAt(i) != '0') && changer2 == "") {
                changer2 = Character.toString(snum.charAt(i));
            }
        }
        if (changer1 == "") {
            changer1 = Character.toString(snum.charAt(0));
        }
        if (changer2 == "") {
            changer2 = Character.toString(snum.charAt(0));
        }
        int a = Integer.parseInt(snum.replaceAll(changer1, "9"));
        int b = Integer.parseInt(snum.replaceAll(changer2, "1"));
        if (!Character.toString(snum.charAt(0)).equals(changer2)) {
            b = Integer.parseInt(snum.replaceAll(changer2, "0"));
        }
        if (b == 0) {
            b = Integer.parseInt(snum.replaceAll(changer2, "1"));
        }

        return a - b;
    }
}
