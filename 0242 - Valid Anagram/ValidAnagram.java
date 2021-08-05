class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char s_letter = s.charAt(i);
            char t_letter = t.charAt(i);
            if (map.containsKey(s_letter)) {
                map.put(s_letter, map.get(s_letter) + 1);
            } else {
                map.put(s_letter, 1);
            }
            if (map.containsKey(t_letter)) {
                map.put(t_letter, map.get(t_letter) - 1);
            } else {
                map.put(t_letter, -1);
            }
        }
        for (int val : map.values()) {
            if (val != 0) return false;
        }
        return true;
    }
}
