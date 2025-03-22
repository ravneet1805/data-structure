package searching.stringBuffer;
// 2. Write a program that compares the performance of StringBuffer and StringBuilder for concatenating strings. For large datasets (e.g., concatenating 1 million strings), compare the execution time of both classes.
class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        int iterations = 1_000_000;
        String text = "hello";

        // Measuring StringBuffer performance
        long startBuffer = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(text);
        }
        long endBuffer = System.nanoTime();
        long timeBuffer = endBuffer - startBuffer;
        System.out.println("Time taken by StringBuffer: " + timeBuffer + " ns");

        // Measuring StringBuilder performance
        long startBuilder = System.nanoTime();
        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sbd.append(text);
        }
        long endBuilder = System.nanoTime();
        long timeBuilder = endBuilder - startBuilder;
        System.out.println("Time taken by StringBuilder: " + timeBuilder + " ns");

        // Compare performance
        System.out.println("StringBuilder is " + (double) timeBuffer / timeBuilder + " times faster than StringBuffer.");
    }
}
