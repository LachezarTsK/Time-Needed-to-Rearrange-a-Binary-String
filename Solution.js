
/**
 * @param {string} binaryInput
 * @return {number}
 */
var secondsToRemoveOccurrences = function (binaryInput) {
    
    let numberOfZeros = 0;
    let seconds = 0;

    for (let digit of binaryInput) {
        if (digit === '0') {
            ++numberOfZeros;
        } else if (numberOfZeros > 0) {
            seconds = Math.max(seconds + 1, numberOfZeros);
        }
    }
    return seconds;
};
