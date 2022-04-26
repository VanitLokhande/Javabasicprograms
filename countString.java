public class countString {
    public static void main(String[] args) {
        String str= "my self vanit";
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) !=' '){
                count++;
            }
        }
        System.out.print(count);
    }
}
