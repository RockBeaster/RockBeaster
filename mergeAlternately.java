//给你两个字符串 word1 和 word2 。
// 请你从 word1 开始，通过交替添加字母来合并字符串。
// 如果一个字符串比另一个字符串长，就将多出来的字母追加到合并后字符串的末尾。
//返回 合并后的字符串 。

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String word1 = "abc";   
        String word2 = "pqr";
        String result = solution.mergeAlternately(word1, word2);
        System.out.println(result);
    }

    static class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < word1.length() && i < word2.length()) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }
        if (i < word1.length()) {
            sb.append(word1.substring(i));
        }
        if (i < word2.length()) {
            sb.append(word2.substring(i));
        }
        return sb.toString();
        
    }
}
}

