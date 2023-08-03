class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replaceAll("A", "b");
        myString = myString.replaceAll("B", "a");
        return myString.toUpperCase().indexOf(pat) > - 1 ? 1 : 0;
    }
}