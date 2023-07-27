class Assignement1_6{

 public static void main(String[] args) {

  String str = "Davda Bhavya";
  String revString = "";

  for (int i = str.length() - 1; i >= 0; --i) {
   revString += str.charAt(i);
  }

  System.out.println(revString);
 }
}