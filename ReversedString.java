public class Kata {

  public static String solution(String str) {
    StringBuilder newStr = new StringBuilder();
    for (int i = str.length() - 1; i >= 0; i -= 1){
      newStr.append(str.charAt(i));
    }
    return newStr.toString();
  }
}
