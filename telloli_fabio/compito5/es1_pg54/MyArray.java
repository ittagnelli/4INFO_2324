package es1_pg54;

public class MyArray {

    public boolean cerca(int[] array, int n) {
        for(int i = 1; i < 5; i++) {
            if(i == n) {
                return true;
            }
        }

        return false;
    }

    public void single(int[] array) {
        for(int i = 1; i < 5; i++) {
            if(array[i] == i++) {
                array[i] = '\0';
            }
        }
    }

    public void stampa(int[] array) {
        for(int i = 1; i < 5; i++) {
            System.out.println(i +", ");
        }
    }
}
