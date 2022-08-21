
public class Solution {

    public int secondsToRemoveOccurrences(String binaryInput) {

        int numberOfZeros = 0;
        int seconds = 0;

        for (int i = 0; i < binaryInput.length(); ++i) {
            if (binaryInput.charAt(i) == '0') {
                ++numberOfZeros;
            } else if (numberOfZeros > 0) {
                seconds = Math.max(seconds + 1, numberOfZeros);
            }
        }
        return seconds;
    }
}
