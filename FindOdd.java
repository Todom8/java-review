public class FindOdd {
    public static int findIt(int[] a) {
        for (int i = 0; i < a.length; i++) {
          int checkNum = a[i];
          int occurrences = 0;
          for (int j = 0; j < a.length; j++) {
            if (checkNum == a[j]) {
              occurrences = occurrences + 1;
            }
          }
          if (occurrences % 2 == 1) {
            return checkNum;
          }
        }
        return 0;
    }
}
