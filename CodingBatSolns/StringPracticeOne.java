/*
* These lines are the solution for helloName
*/

public String helloName(String name) {
  
  return "Hello " + name + "!";
}

/*
* These lines are the solution for makeAbba
*/

public String makeAbba(String a, String b) {
  return a+b+b+a;
}

/*
* These lines are the solution for makeTags
*/

public String makeTags(String tag, String word) {
  return "<" + tag + ">" + word + "</" + tag + ">";
}

/*
*These lines are the solution for firstHalf
*/

public String firstHalf(String str) {
  int half = (str.length()/2);
  String firstThree = new String (str.substring(0,half));
  return firstThree;
}
