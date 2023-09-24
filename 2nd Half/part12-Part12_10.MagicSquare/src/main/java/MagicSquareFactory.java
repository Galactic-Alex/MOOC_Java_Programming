
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        int columnY = 0;
        int rowX = square.getWidth() / 2;
        int counter = 1;
        int[] previousPosition = {0, 0};
        do {
            if (square.readValue(rowX, columnY) == 0) {
                previousPosition[0] = rowX;
                previousPosition[1] = columnY;
                square.placeValue(rowX, columnY, counter);
                counter++;
                rowX++;
                columnY--;
            } else {
                rowX = previousPosition[0];
                columnY = previousPosition[1];
                columnY++;
            }
            if (columnY < 0) {
                columnY = square.getWidth() - 1;
            }
            if (rowX > square.getHeight() - 1) {
                rowX = 0;
            }
        } while (counter < square.getWidth() * square.getHeight() + 1);
        return square;
    }


}
