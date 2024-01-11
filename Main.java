public class Main {

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Przykłady testowe
        System.out.println(countVowels("Hi There!"));
        System.out.println(countVowels("Why do you ask?"));
        System.out.println(countVowels("Why?"));
        System.out.println(countVowels("Java is awesome"));
    }
}
