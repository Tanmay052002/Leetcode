class Solution {
   public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<>();
        }
        return getLetterCombinations(digits,0);
   }
    static String[] codes = {" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> getLetterCombinations(String digits, int idx) {
        if(idx == digits.length()){
            List<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        List<String> mres = new ArrayList<>();
        List<String> rres = getLetterCombinations(digits,idx+1);

        char ch = digits.charAt(idx);
        String code = codes[ch-'0'];

        for (int i = 0; i < code.length(); i++) {
            char sch = code.charAt(i);

            for (String rstr : rres) {
                mres.add(sch + rstr);
            }

        }
            return mres;
    }
}