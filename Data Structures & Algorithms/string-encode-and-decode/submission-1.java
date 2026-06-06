class Solution {

    public String encode(List<String> strs) {
        StringBuilder enc = new StringBuilder();

        for (String str : strs) {
            enc.append(str.length());
            enc.append('#');
            enc.append(str);
        }

        return enc.toString();
    }

    public List<String> decode(String str) {

        List<String> dec = new ArrayList<>();
        int a = 0;

        while (a < str.length()) {

            StringBuilder k = new StringBuilder();
            int len = 0;

            for (int i = a; ; i++) {
                if (str.charAt(i) == '#') {
                    a = i;
                    break;
                }

                len = len * 10 + (str.charAt(i) - '0');
            }

            for (int i = a + 1; i < a + len + 1; i++) {
                k.append(str.charAt(i));
            }

            dec.add(k.toString());

            a = a + len + 1;
        }

        return dec;
    }
}