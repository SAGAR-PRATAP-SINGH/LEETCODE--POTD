class Solution {
    public int findMinDifference(List<String> timepoints) {
        //convert input to minutes
        int[] minutes = new int[timepoints.size()];
        for(int i=0; i< timepoints.size(); i++){
            String time = timepoints.get(i);
            int h = Integer.parseInt(time.substring(0, 2));
            int m = Integer.parseInt(time.substring(3));
            minutes[i] = h * 60 + m;
        }

        //sort times in increasig order
        Arrays.sort(minutes);

        //fidn min. diff. across adjacent ele.
        int ans = Integer.MAX_VALUE;
        for(int i=0 ;i< minutes.length - 1; i++){
            ans = Math.min(ans, minutes[i+1] - minutes[i]);
        }

        //consider diff. between last & first ele.
        return Math.min(ans, 
                            24 * 60 - minutes[minutes.length -1] + minutes[0]);
    }
}
