import java.util.Random;

// Lab_1, #34539
public class LAB_1 {
    public static void main(String[] args) {
        // #1.0 Creating array and fill it
        long[] a = new long[17];
        for (int i = 1; i <= 17; i++){
            a[i - 1] = i;
        }

        // #2.0 Creating array and fill it random value
        double[] x = new double[13];
        for (int i = 0; i < 13; i++){
            Random random = new Random();
            x[i] = random.nextDouble(-9.0, 3.0);
        }

        // #3.1 Creating array and fill it with formulas
        double[][] y = new double[17][13];
        for (int i = 0; i < 17; i++){
            for (int j = 0; j < 13; j++){
                if (a[i] == 2){
                    y[i][j] = Math.PI / Math.cbrt(x[j]) + 1;
                }else if(a[i] == 1 || a[i] == 3 ||a[i] == 4 || a[i] == 5 || a[i] == 6 || a[i] == 12 || a[i] == 14 || a[i] == 16){
                    y[i][j] = Math.pow(Math.E, Math.atan(Math.pow((x[j] - 3) / 12, 2)));
                }else{
                    double left_part_numerator = Math.pow(0.75 * (Math.sin(x[j]) - Math.PI), 3) + 2. / 3;
                    double left_part_denominator = Math.asin((x[j] - 3) / 16);
                    double left_part = (1 - Math.pow(left_part_numerator / left_part_denominator, 3)) / 2;
                    double right_part = Math.cos(Math.pow(x[j] * (x[j] - 1), 2));

                    y[i][j] = left_part * right_part;
                }
            }
        }

        // #3.2 Print array
        for (int i = 0; i < 17; i++){
            for (int j = 0; j < 13; j++){
                System.out.printf("%14.5f ", y[i][j]);
            }
            System.out.println();
        }
    }
}
