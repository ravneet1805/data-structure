package searching.stringBuffer;
// 1. You are given an array of strings. Write a program that uses StringBuffer to concatenate all the strings in the array efficiently.
class StringBufferConcatenation {
    public static String concatenateStrings(String[] strings) {
        StringBuffer sb = new StringBuffer();
        for (String str : strings) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Hello", " ", "World", "!", " Welcome", " to", " Java."};
        String result = concatenateStrings(words);
        System.out.println("Concatenated String: " + result);
    }
}
