import java.util.Random;
import java.text.DecimalFormat;

public class Main {

    private static final DecimalFormat format = new DecimalFormat("0.0000000");
    public static void main(String[] args) {
        int[] smallArray = generateRandomArray(30);
        int[] largeArray = generateRandomArray(100000);

        Context context = new Context();


        context.setStrategy(new Bubble());
        System.out.println("BubbleSort - Small Array: " + format.format(measureTime(context, smallArray)) + " seconds");
        System.out.println("BubbleSort - Large Array: " + format.format(measureTime(context, largeArray)) + " seconds");


        context.setStrategy(new Merge());
        System.out.println("MergeSort - Small Array: " + format.format(measureTime(context, smallArray)) + " seconds");
        System.out.println("MergeSort - Large Array: " + format.format(measureTime(context, largeArray)) + " seconds");


        context.setStrategy(new Quick());
        System.out.println("QuickSort - Small Array: " + format.format(measureTime(context, smallArray)) + " seconds");
        System.out.println("QuickSort - Large Array: " + format.format(measureTime(context, largeArray)) + " seconds");
    }


    // random array function  -> copilot
    private static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100000);
        }
        return arr;
    }

    // measure time function  -> copilot
    private static double measureTime(Context context, int[] arr) {
        long start = System.nanoTime();
        context.useStartegy(arr.clone());
        long end = System.nanoTime();
        return (end - start) / 1_000_000_000.0;
    }
}
