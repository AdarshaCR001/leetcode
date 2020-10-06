import java.util.HashSet;
import java.util.Set;

public class Problem36_ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] box = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            box[i] = new HashSet<>();
        }
        for (int i = 0; i < 9; i++) {
            Set<Character> row = new HashSet<>();
            Set<Character> column = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                char rcel = board[i][j];
                char ccel = board[j][i];
                if (!row.contains(rcel)) {
                    if (rcel != '.')
                        row.add(rcel);
                } else {
                    return false;
                }
                if (!column.contains(ccel)) {
                    if (ccel != '.')
                        column.add(ccel);
                } else {
                    return false;
                }

                int r1 = i / 3;
                int r2 = j / 3;
                r1 = r1 * 3;
                if (!box[r1 + r2].contains(rcel)) {
                    if (rcel != '.')
                        box[r1 + r2].add(rcel);
                } else {
                    System.out.println(rcel);
                    System.out.println(box[r1 + r2] + " " + (r1 + r2));
                    System.out.println(i + " " + j);
                    return false;
                }
            }
        }
        return true;
    }
}
