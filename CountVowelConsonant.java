public class CountVowelConsonant {
    public static void main(String[] args) {
        String str = "i m vanit and u";
        int len = str.length();
        int countV=0;
        int countC=0;
        for(int i=0;i<len;i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                countV++;
        }
            else if(str.charAt(i) >= 'a' && str.charAt(i)  <= 'z'){
                countC++;

            }
    }
        System.out.print("vowels="+countV);
        System.out.println();
        System.out.print("consonant="+countC);

    }
}
