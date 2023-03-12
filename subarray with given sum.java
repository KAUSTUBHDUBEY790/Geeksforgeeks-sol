class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
int st = 0, end = 0, curSum = 0;

     boolean flag = false;

   ArrayList<Integer> ans = new ArrayList<Integer>();

   

   for(int i = 0;i<n;i++) {

         curSum += arr[i];

        if(curSum>=s) {

        end = i;

    while (s < curSum && st < end) {

        curSum -= arr[st];

           ++st;

       }

       if(curSum == s) {

           ans.add(st+1);

           ans.add(end+1);

            flag = true;

           break;

       }

     }

       

    }

    if(flag == false) {

     ans.add(-1);

    }

     return ans;



 


    }
}
