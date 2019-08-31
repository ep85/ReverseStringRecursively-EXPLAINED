class testClass {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println(reverse("HELLO"));
  }
  public static String reverse(String str){
    if(str.length()==0){return str;}
    System.out.println(str.substring(1)+str.charAt(0));
    return reverse(str.substring(1))+str.charAt(0);
    //HELLO reverse(ELLO)+H -> ELLOH
    //ELLO  reverse(LLO)+O -> LLOE
    //LLO  reverse(LO)+L -> LOL
    //LO  reverse(O)+L -> OL
    //O  reverse()+O -> O
    //CASE HITS STR.LENGTH()==0
    //RETURNS OLLEH
  }
}
