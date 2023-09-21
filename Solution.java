import java.util.Arrays;
class Solution{
    public static int solve(String s){
     return Arrays.stream(s.split("[^aeiou]")).mapToInt(i -> i.length()).max().getAsInt();
  }
}
/*
The vowel substrings in the word codewarriors are o,e,a,io. The longest of these has a length of 2. Given a lowercase string that has alphabetic characters only (both vowels and consonants) and no spaces, return the length of the longest vowel substring. Vowels are any of aeiou.

Good luck!

If you like substring Katas, please try:

Non-even substrings

Vowel-consonant lexicon


*/