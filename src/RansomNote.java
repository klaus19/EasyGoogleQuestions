public class RansomNote {


    public boolean canConstruct(String ransomNote, String magazine) {

        int[] alphabet = new int[26];
        for(char c : magazine.toCharArray()) alphabet[c - 'a']++;
        for(char c : ransomNote.toCharArray()) alphabet[c - 'a']--;
        for(int i : alphabet) {
            if(i < 0) return false;
        }
        return true;

    }
}
