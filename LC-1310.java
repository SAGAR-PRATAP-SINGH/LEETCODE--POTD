class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] pre = new int[n];
        pre[0]= arr[0];    //STORING THWE VAL. of ARR.
        
        for(int i=1;i <n; i++){
            pre[i] =pre[i-1] ^ arr[i];    //STORING the PREV. XOR VAL.
        }
        int[] res = new int[queries.length];

        for(int k=0; k< res.length; k++){
//STORING VAL. OF QUERIES   
            int i = queries[k][0];
            int j = queries[k][1];
            
            if(i==0){
                res[k] = pre[j];
            }else{
                res[k] = pre[j]^pre[i-1];
            }
        }
        return res;
    }
}
