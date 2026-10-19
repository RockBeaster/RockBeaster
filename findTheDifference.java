//给定两个字符串 s 和 t ，它们只包含小写字母。
//字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
//请找出在 t 中被添加的字母。

public class findTheDifference {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "";
        String t = "y";
        char result = solution.findTheDifference(s, t);
        System.out.println(result); // 输出: e
    }

    static class Solution {
        public char findTheDifference(String s, String t) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            for (char c : t.toCharArray()) {
                count[c - 'a']--;
                if (count[c - 'a'] < 0) {
                    return c;
                }
            }
            return '\0'; // 如果没有找到不同的字母，返回空字符
        }
    }
}
