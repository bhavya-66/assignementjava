class Assignement1_5 {
    public static void main(String[] args) {
        String str = "hello davda bhavya this side ";
        char ch = 'a';
        int cnt = 0;
         
        for ( int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                cnt++;
        }
        System.out.println("Occurrences of "+ch+" are " +cnt);
    }
}
