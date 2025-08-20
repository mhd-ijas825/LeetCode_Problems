class Solution {
    public List<List<Integer>> permute(int[] nums) {
          List<Integer> list = new ArrayList<>();
        for(int i : nums){
            list.add(i);
        }
        List<Integer> li1 = new ArrayList<>();
        List<List<Integer>> li2 = new ArrayList<>();
        solve(list, li1, li2);
        return li2;
    }
    public void solve(List<Integer> list, List<Integer> li1, List<List<Integer>> li2){
        
        if(list.size() == 0){
            li2.add(new ArrayList(li1));
            return;
        }

        for(int i = 0; i < list.size(); i++){
            int n = list.remove(i);
            li1.add(n);
            solve(list, li1, li2);
            list.add(i, n);
                        
            li1.remove(li1.size()-1);
        }
    }
}