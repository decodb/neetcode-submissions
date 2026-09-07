class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String s: strs) {
            int[] count = new int[26];
            for (char c: s.toCharArray()) {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);

            ArrayList<String> list = map.get(key);
            if (list == null) {
                list = new ArrayList<>();
                map.put(key, list);
            }

            list.add(s);
        }

        return new ArrayList<>(map.values());
    }
}