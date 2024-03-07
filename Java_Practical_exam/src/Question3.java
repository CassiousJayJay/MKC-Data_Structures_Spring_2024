public class Question3 {
    public static void main(String[] args){
        String name = "Juliet";
        char[] c = name.toCharArray();
        int vowel = 0;

        for (int i = 0; i < name.length(); i++){
            if(name.charAt(i) == 'a'|| name.charAt(i) == 'e' || name.charAt(i) == 'i'||
                    name.charAt(i) == 'o'|| name.charAt(i) == 'u')
                vowel++;
        }
        System.out.println("Vowels: " + vowel);
    }
}
