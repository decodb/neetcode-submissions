class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int length = 0;

        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            char curr = s.charAt(r);
            freq.put(curr, freq.getOrDefault(curr, 0) + 1);

            int maxFreq = 0;
            for (int val: freq.values()) {
                if (val > maxFreq) {
                    maxFreq = val;
                }
            }

            if ((r - l + 1) - maxFreq > k) {
                freq.put(s.charAt(l), freq.get(s.charAt(l)) - 1);
                l++;
            }


            length = Math.max(length, (r - l + 1));
        }

        return length;
    }
}
