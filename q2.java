/*
Q2 Combination sum with a twist

Find all valid combinations of k numbers that sum up to n such that the following conditions are true:

Only numbers 1 through 9 are used.
Each number is used at most once.
Return a list of all possible valid combinations.
 The list must not contain the same combination twice, and the combinations may be returned in any order.
 */

 //Code

 class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {//n is target sum 
     List<List<Integer>> result=new ArrayList();
     helper(1,k,n,0,result,new LinkedList());
     return result;
     }
    private void helper(int ind,int k,int n,int sum,List<List<Integer>> result,LinkedList ll){
         //base case
        if(sum==n && k==0){
            //valid set
            result.add(new ArrayList(ll));
            return;
        }
        
        for(int i=ind;i<=9;i++){
            //1 to 9
            ll.add(i);//current element added to list
            helper(i+1,k-1,n,sum+i,result,ll);
            ll.removeLast();//backtracking if its not the reqd element
        }
 
    }
 }