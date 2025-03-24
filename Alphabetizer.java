import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The Alphabetizer class is designed to sort the alphabetic characters
 * of an input string in a case-insensitive way
 * while maintaining the original casing of the characters in the output.
 */
public class Alphabetizer {

    /**
     * Sorts the input string and returns its alphabetic characters in order
     * Case-insensitive, but leaves the casing of the original.
     *
     * @param inputString The string that is to be sorted (alphabetized)
     * @return the sorted string
     * @throws IllegalArgumentException if no alphabetic characters are present in the input
     */
    public static String getAlphabetizedString(String inputString) {

        // Extracting and sorting the alphabetic characters while preserving case
        List<Character> sortedAlphabeticCharacters = inputString.chars()
                .mapToObj(character -> (char) character)
                .filter(Character::isLetter)
                .sorted(Comparator.comparingInt(Character::toLowerCase))
                .toList();

        // Validating that input contains alphabetic characters
        if (sortedAlphabeticCharacters.isEmpty()) {
            throw new IllegalArgumentException("No alphabetic characters were found in provided input string/s: \"" + inputString + "\"");
        }

        // Constructing the final sorted string while maintaining original character casing
        return sortedAlphabeticCharacters.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    /**
     * The entry point of the application.
     *
     * @param args command-line arguments representing input strings
     */
    public static void main(String[] args) {
        // Validating that at least one argument is provided
        if (args.length == 0) {
            System.err.println("Error: No input has been provided.");
            System.err.println("Usage: Please provide input strings to alphabetize \"YourInput\" [\"AdditionalInput\"]");
            System.err.println("Example: java Alphabetizer \"VirginiaTech\" \"3 Blind Mice\"");
            return;
        }

        // Processing each input string from command-line arguments
        for (String input : args) {
            try {
                String alphabetizedResult = getAlphabetizedString(input);
                System.out.println(alphabetizedResult);
            } catch (IllegalArgumentException exception) {
                System.err.println(exception.getMessage());
            }
        }
    }
}
