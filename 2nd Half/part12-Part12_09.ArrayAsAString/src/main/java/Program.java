
public class Program {

    public static void main(String[] args) {

    }

    public static String arrayAsString(int[][] array) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                stringBuilder.append(array[row][column]);
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
