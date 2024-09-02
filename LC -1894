class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length; //Length of the array(chalk)
        long sum = 0;                //Values can go upto (10^9 very high)
        for(int i: chalk) sum += i;    
        
        int remaining = (int)(k % sum);

        for(int i=0 ;i<n; i++){
            if(remaining < chalk[i]){
                return i;
            }
            remaining -= chalk[i];
        }
        return -1;
    }
}
