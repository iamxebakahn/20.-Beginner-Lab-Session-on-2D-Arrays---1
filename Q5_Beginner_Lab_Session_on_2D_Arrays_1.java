/*Problem Description

You are given a list of strings, A. Your task is to extract all the vowels (both uppercase and lowercase) from each string and return them as a 2D character array.

Each row of the 2D array corresponds to the vowels extracted from a single string in the input list, maintaining the order in which they appear.

If a string has no vowels, the corresponding row will be an empty list [].


Problem Constraints

Input will consist of at least one string.
Each string will contain only alphabets (A-Z, a-z) and spaces.
Vowels to be considered are: a, e, i, o, u (case insensitive).


Input Format

A list of strings.


Output Format

A 2D character array where each row contains the vowels extracted from the corresponding string in the input list.

If a string is empty or has no vowels, the corresponding row will be an empty list [].


Example Input

Input 1:
[
    "Java Programming",
    "Array Data Structure",
    "Computer"
]
Input 2:
[
    "Rhythm",
    "Python"
]


Example Output

Output 1:
[
    ['a', 'a', 'o', 'a', 'i'],
    ['A', 'a', 'a', 'a', 'u', 'u', 'e'],
    ['o', 'u', 'e']
]
Output 2:
[
    [],
    ['o']
]



Example Explanation

Explanation 1:
For "Java Programming", the vowels are a, a, o, a, i.
For "Array Data Structure", the vowels are A, a, a, a, u, u, e.
For "Computer", the vowels are o, u, e.
Explanation 2:
For "Rhythm", no vowels exist, so return [].
For "Python", the vowel is o. */
class Q5_Beginner_Lab_Session_on_2D_Arrays_1 {

    

    //public ArrayList<ArrayList<Character>> extractVowels(ArrayList<String> strings) {
    //     // Define vowels (both uppercase and lowercase)
    //     String vowels = "aeiouAEIOU";

    //     // ArrayList to store the result
    //     ArrayList<ArrayList<Character>> result = new ArrayList<>();

    //     // Iterate over each string
    //     for (String str : strings) {
    //         ArrayList<Character> row = new ArrayList<>();
    //         for (char ch : str.toCharArray()) {
    //             if (vowels.indexOf(ch) != -1) { // Check if the character is a vowel
    //                 row.add(ch);
    //             }
    //         }
    //         result.add(row);
    //     }
    //     return result;


            /* 
            MY VERY OWN PERSONAL CODE
            ArrayList<ArrayList<Character>> al_vowels=new ArrayList<>();

            for(int i=0;i<strings.size();i++)
            {
              ArrayList<Character> row_vowel=new ArrayList<>();
              for(int j=0;j<strings.get(i).length();j++)
              {
                char ch=strings.get(i).charAt(j);
                if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='o'||ch=='O'||ch=='i'||ch=='I'||ch=='u'||ch=='U')
                {
                  row_vowel.add(ch);
                }

              }

              al_vowels.add(row_vowel);
            }

            return al_vowels;
            */
        
            public ArrayList<Character> get_vowel_al(String one_string)
            {
            ArrayList<Character> vowel_from_single_string_al=new ArrayList<>();
            for(int i=0;i<one_string.length();i++)
            {
                char ch=one_string.charAt(i);

                if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
                        vowel_from_single_string_al.add(ch);
            }        
            return vowel_from_single_string_al;
            }

              
        public ArrayList<ArrayList<Character>> extractVowels(ArrayList<String> strings) 
        {
            ArrayList<ArrayList<Character>> vowel_dynamic_al= new ArrayList<>(); 
            for(int i=0;i<strings.size();i++)
            {
                ArrayList<Charac

import java.util.ArrayList;

                vowel_dynamic_al.add(vowel_list);

            }

            return vowel_dynamic_al;
        }
}

