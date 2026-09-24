class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int m=bookings.length;
        int arr[]=new int[n];
        for(int i=0;i<m;i++)
        {
            int first=bookings[i][0];
            int last=bookings[i][1];
            int seats=bookings[i][2];
           arr[first-1]= arr[first-1]+seats;
           if(last<n){
            arr[last]=arr[last]-seats;
            }
        }
        for(int i=1;i<n;i++)
        {
            arr[i]+=arr[i-1];
        }
        return arr;
    }
}