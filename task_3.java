import java.util.Arrays;

public class task_3 {

    public static void main(String[] args) {

        int[] array = {2, 5, 3, 9, 12, 6, 15};

        Arrays.sort(array);

        for(int i = 0; i < array.length; i++) {
            if(array[i] % 3 == 0) {
                System.out.print(array[i]);
                if(i < array.length - 1) {
                    System.out.print(", ");
                }
            }
        }

    }

}