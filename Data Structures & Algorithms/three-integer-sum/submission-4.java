class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sums = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];

            if (i > 0 && curr == nums[i-1]) {
                continue;
            }

            if (curr > 0) {
                break;
            }

            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = curr + nums[l] + nums[r];

                if (sum > 0) {
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    sums.add(Arrays.asList(curr, nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l-1]) {
                        l++;
                    }

                    while (r > l && nums[r] == nums[r+1]) {
                        r--;
                    }
                }
            }
        }

        return sums;
    }
}
