
using namespace std;

class Solution {
    
public:
    int secondsToRemoveOccurrences(string binaryInput) {

        int numberOfZeros = 0;
        int seconds = 0;

        for (const auto& digit : binaryInput) {
            if (digit == '0') {
                ++numberOfZeros;
            } else if (numberOfZeros > 0) {
                seconds = max(seconds + 1, numberOfZeros);
            }
        }
        return seconds;
    }
};
