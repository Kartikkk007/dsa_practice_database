class RevStr {

    public static String reversewords(String s){
        if (s == null) return "";
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(' ');
            }
        }
        return reversed.toString();
    }




 public static void main(String[] args) {
        String s = "  Hello   World  ";
        System.out.println("Reversed: '" + reversewords(s) + "'");
    }

}