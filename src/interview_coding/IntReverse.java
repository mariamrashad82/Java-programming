package interview_coding;

public class IntReverse {
    // revArr({1, 2, 3, 4, 5}) -> {5, 4, 3, 2, 1}
    // revArr({1})             -> {1}
    // revArr({1, 2, 3})       -> {3, 2, 1}

    public void revArr(int[] arrNum) {

        int j = arrNum.length - 1;


        for (int i = 0; i < arrNum.length / 2; i++) {
            // swap elements using positions of i and (j - i)
            int tmp = arrNum[i];
            arrNum[i] = arrNum[j - i];
            arrNum[j - i] = tmp;
        }
    }

}
