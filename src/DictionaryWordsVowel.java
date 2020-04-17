import java.util.Scanner;

public class DictionaryWordsVowel {
    public static void main(String[] args) {
        //Scanner object
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 words separated by space: ");
        String str = in.nextLine();
        String [] strArr = str.split(" ");
        System.out.println("Original order: \n" + str);

        /**Bubble sort:
         * Start with an outer loop to compare the string at index[i] to the rest of the array.
         */
        for (int i = 0; i < strArr.length -1; i++) {
            // create an inner loop to iterate while comparing with string at index i
            for (int j = i + 1; j < strArr.length; j++) {
                /**Swap:
                 * If need to swap: store array[i] in temporary variable
                 * then replace array[i] with array[j]
                 * then replace array[j] with the temporary variable
                 */
                if (strArr[i].compareToIgnoreCase(strArr[j]) > 0) {
                    String hold = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = hold;
                }
            }
        }
        System.out.print("\nAlphabetical Order:\n");
        // create a loop to print the ordered array
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i] + " ");
        }
        System.out.print("\n\nReversed Alphabetical Order:\n");
        //start at end of the array and stop at index 0
        for (int i = strArr.length -1; i >= 0; i--) {
            System.out.print(strArr[i] + " ");
        }
        // words that start with a vowel:
        //first later of the string
        System.out.print("\n\nWords that starts with a vowel:\n");
        for (int i = 0; i < strArr.length; i++) {
            char firstLater = strArr[i].charAt(0);
            switch (firstLater) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.print(strArr[i] + " ");
            }

        }


    }
}

//pseudocode is in text file

//kiwi pineapple apple banana orange grapes watermelon dog ear day