
public class Task {

    public int[] elementsAfterTheLastDigitFour(int[] array) {
        int position = 0;
        boolean presenceOf4 = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                position = i;
                presenceOf4 = true;
            }
        }
        if (presenceOf4) {
            int[] tempArray = new int[array.length - position - 1];
            System.arraycopy(array, ++position, tempArray, 0, tempArray.length);
            return tempArray;
        } else throw new RuntimeException();
    }

    public boolean arrayOfOnesAndFours(int[] array) {
        boolean presenceOf1 = false;
        boolean presenceOf4 = false;
        for (int j : array) {
            if (j == 1) presenceOf1 = true;
            else if (j == 4) presenceOf4 = true;
            else return false;
        }
        return presenceOf1 && presenceOf4;
    }
}
