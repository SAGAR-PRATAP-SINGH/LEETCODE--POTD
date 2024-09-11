class Solution {
    public int minBitFlips(int start, int goal) {
    // XOR will give 1 where the bits are different
        int xor = start ^ goal;

        int xor = start ^ goal;
        int count = 0;
//set bits 0(32) complexity
        while(xor > 0){ 
// Right-shift to check the next bit
            xor = xor & (xor-1);
 // If the last bit is 1, increment count 
            count++;
        }
        return count;
    }
}
