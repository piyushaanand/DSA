class Solution {
    public String reverseWords(String s) {
        // Bruteforce Approach
        // String res[] = s.split(" ");
        // StringBuilder sb = new StringBuilder();
        // for(int i = res.length - 1 ; i >= 0 ; i--){
        //     if(res[i].length() == 0){
        //         continue;
        //     }
        //     if(sb.length() == 0){
        //         sb.append(res[i]);
        //     }else{
        //         sb.append(" ");
        //         sb.append(res[i]);
        //     }
        // }
        // return sb.toString();

        //Optimal Approach
        StringBuilder sb = new StringBuilder();
        int st = s.length() - 1;
        while (st >= 0) {
            while (st >= 0 && s.charAt(st) == ' ') {
                st--;
            }
            if (st < 0) {
                break;
            }
            int en = st;
            while (st >= 0 && s.charAt(st) != ' ') {
                st--;
            }
            if (sb.length() == 0) {
                sb.append(s.substring(st + 1, en + 1));
            } else {
                sb.append(" ");
                sb.append(s.substring(st + 1, en + 1));
            }
        }

        return sb.toString();
    }
}