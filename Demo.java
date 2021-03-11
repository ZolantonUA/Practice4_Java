import java.util.Random;
public class Demo {
    public static int qwe = 123456;
    public static int n = 100;

    public static void Mass()
    {
        Random rand = new Random();
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = rand.nextInt(100);
        }
        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            avg += array[i] / array.length;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }

    public static String reverse(int str)
    {
        String qwe = Integer.toString(str);
        return new StringBuilder(qwe).reverse().toString();
    }

    public static void main(String[] args)
    {
        Mass();
        System.out.println(reverse(qwe));
    }
}




