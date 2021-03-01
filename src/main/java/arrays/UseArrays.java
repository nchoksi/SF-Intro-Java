package arrays;

import java.util.Arrays;

public class UseArrays {
  public static void main(String[] args) {
    int [] values = new int[4]; // Size is fixed after creation
    for (int idx = 0; idx < values.length; idx++) {
      values[idx] = idx * 2;
    }
    System.out.println("Array is: " + Arrays.toString(values));
//    System.out.println(values[-1]);

    int [] v2 = new int[6];
    System.arraycopy(values, 0, v2, 1, 3);
    values = v2;
    System.out.println("values is now " + Arrays.toString(values));
  }
}
