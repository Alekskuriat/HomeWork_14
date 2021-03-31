import java.util.Arrays;

public class Task {

    /*public static void main(String[] args) {
        int[] arrayTaskOne = new int[]{1, 3, 5, 4, 2, 2, 1, 9, 2, 3, 1, 1, 5};
        int[] arrayTaskTwo = new int[]{1, 4, 1, 1, 1, 4, 1};
        int[] arrayResult;
        arrayResult = elementsAfterTheLastDigitFour(arrayTaskOne);
        System.out.println(Arrays.toString(arrayResult));
        System.out.println(arrayOfOnesAndFours(arrayTaskTwo));
    }*/


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
