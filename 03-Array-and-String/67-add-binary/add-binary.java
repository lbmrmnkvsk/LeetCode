class Solution {
    public String addBinary(String a, String b) {
            int n = a.length();
            int m = b.length();
            if (m > n) {
                return addBinary(b, a);
            }

            StringBuilder sb = new StringBuilder();
            int carry = 0;
            int j = m - 1;
            for (int i = n - 1; i >= 0; i--) {
                if (a.charAt(i) == '1') {
                    carry++;
                }
                if (j >= 0 && b.charAt(j) == '1') {
                    carry++;
                }

                if (carry % 2 == 1) {
                    sb.append('1');
                } else {
                    sb.append('0');
                }

                carry /= 2;
                j--;
            }

            if (carry == 1) {
                sb.append('1');
            }

            return sb.reverse().toString();
        }
}