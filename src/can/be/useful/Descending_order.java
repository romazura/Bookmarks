package can.be.useful;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


public class Descending_order {

    // Сортировка трех чисел в порядке убывания.

    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer arr[] = new Integer[3];
        for(int i = 0; i <  arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}



