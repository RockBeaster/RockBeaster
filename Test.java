public class Test {
    public static void main(String[] args) {
        int a = 0;
        int x = "0".equals(a)?0:1;
        System.out.println(x);

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

