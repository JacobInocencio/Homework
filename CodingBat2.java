//makeOutWord
/**
* First half of "out" → .substring(0, 2)
* Length is 4, so it works
* Didn’t change anything for "word"
* Last half of "out" → .substring(length - 2, length)
*/
public String makeOutWord(String out, String word) {
  return out.substring(0,2) + word + out.substring((out.length()-2),out.length());
}

//extraEnd
/**
* Last two → .substring(length - 2, length)
* Always gives last two characters of any string
* Stored in a String variable and returned three times
*/
public String extraEnd(String str) {
    String lastTwo = str.substring(str.length()-2,str.length());
    return lastTwo + lastTwo + lastTwo;
}

//firstTwo
/**
* At first, I knew how to do each part separately but not together
* Researched the Math method
* Found Math.min works for this
* Math.min(2, str.length()) → gives first two chars, or the whole string if shorter
*/
public String firstTwo(String str) {
    String firstLetters = str.substring(0,Math.min(2,str.length()));
    
    return firstLetters;
}

//withoutEnd
/**
* Very easy compared to others
* .substring(1, length - 1) → removes first and last letters
* Returned the result
*/
public String withoutEnd(String str) {
    return str.substring(1,str.length()-1);
}
