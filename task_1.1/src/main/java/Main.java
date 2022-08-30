public class Main {
    public static void main(String[] args) {

        int max = 0;
        int min = 0;
        double average = 0;
        int count = 0;

        int a = 2;
        int b = 2;
        int [][] arr = new int[a][b];
        count = a*b;
        for (int i =0; i < a; i++) {
            for ( int j = 0; j < b; j++) {

                 arr[i][j] = (int) (Math.random()*(200+1)) - 100;
                 average += arr[i][j];
                 System.out.print(arr[i][j] + " ");

                if (i == 0 && j == 0) {
                    max = arr[i][j];
                    min = arr[i][j];
                }
                if (arr[i][j] < min)
                    min = arr[i][j];
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
            System.out.println();
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average = " + average/count);

    }
}
