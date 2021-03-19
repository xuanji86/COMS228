public class ItemChoice {

   public static <T extends Comparable<T>>
   T chooseItem(T item1, T item2, T item3) {
      T chosenItem = item1;

      if (item2.compareTo(chosenItem) < 0) {
         chosenItem = item2;
      }
      if (item3.compareTo(chosenItem) < 0) {
         chosenItem = item3;
      }
      return chosenItem;
   }

   public static void main(String[] args) {
      Integer i1 = 7;
      Integer i2 = 9;
      Integer i3 = 5;

      Character c1 = 'e';
      Character c2 = 'a';
      Character c3 = 'm';

      String s1 = "lime";
      String s2 = "purple";
      String s3 = "orange";

      System.out.println(chooseItem(c1, c2, c3));
      System.out.println(chooseItem(i1, i2, i3));
      System.out.println(chooseItem(s1, s2, s3));
   }
}