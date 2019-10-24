package src.basic;
import java.util.*;
import java.time.*;
public class Strings{
  // public static void main(String[] args){
  //
  //
  //
  //
  //   System.out.println(LocalDate.now());
  //   System.out.println(LocalTime.now());
  //   System.out.println(LocalDateTime.now());



    // List<String> list = new ArrayList<>();
    // list.add("Darou");
    // list.add("Ewcia");
    // Object[] objectArray = list.toArray();
    // System.out.println(Arrays.toString(objectArray));
    // String[] stringArray = list.toArray(new String[2]);
    // System.out.println(Arrays.toString(stringArray));
    //
    // List<String> list2 = Arrays.asList(stringArray);
    // list2.set(1,"Ewunia");
    // System.out.println("list2: "+list2);
    // // list2.remove(0) //error on List!
    // System.out.println("stringArray: "+Arrays.toString(stringArray));

    // Immutable a = new Immutable("someString");
    // System.out.println(a.getS());

    // Mutable b = new Mutable("OtherString");
    // System.out.println(b.getS());
    // b.setS("abcdefghijABCDEFGHIJ");
    // String c = b.getS();
    // System.out.println(c);
    // System.out.println("c.length(): " + c.length());
    // System.out.println("c.charAt(0): " + c.charAt(0));
    // System.out.println("c.indexOf(\"b\"): " + c.indexOf("b"));
    // System.out.println("c.indexOf('c'): " + c.indexOf('c'));
    // System.out.println("c.indexOf(\"bcd\",8): " + c.indexOf("bcd",8));
    // System.out.println("c.indexOf('c',8): " + c.indexOf('c',8));
    // System.out.println("c.substring(10): " + c.substring(10));
    // System.out.println("c.substring(1,8): " + c.substring(1,8));
    // System.out.println("c.substring(1,1): " + c.substring(1,1));
    // System.out.println("c.toLowerCase(): " + c.toLowerCase());
    // System.out.println("c.toUpperCase(): " + c.toUpperCase());
    // String smalls = c.substring(0,10);
    // String capitals = c.substrin    String[] strs = {"1","21","34","76","5","3","2","7","6","9","4","8","10","11","12"};
    // System.out.println("smalls(c.substring(0,9)): "+smalls);
    // System.out.println("capitals(c.substring(10)): "+capitals);
    //
    // System.out.println("capitals.equals(smalls): " + capitals.equals(smalls));
    // System.out.println("capitals.equalsIgnoreCase(smalls): "
    // + capitals.equalsIgnoreCase(smalls));
    // System.out.println(c.substring(0,10).startsWith("a") + " "
    // + c.substring(0,10).endsWith("j"));
    // System.out.println("smalls.contains(\"abc\"): "+smalls.contains("abc"));
    // System.out.println("capitals.contains(\"abc\"): "+capitals.contains("abc"));
    // capitals = capitals.replace(capitals,smalls);
    // smalls = smalls.replace('a','p');
    // System.out.println("capitals = capitals.replace(capitals,smalls): "+capitals);
    // System.out.println("smalls = capitals.replace(capitals,smalls): "+smalls);


    // int[] arr0; //no error
    // int[] arr1 = new int[3];
    // // int[] arr2 = new int[]; //error: array dimension missing
    // int[] arr3 = {1,2,3};
    // int[] arr4 = new int[] {1,2,3};
    // // int[] arr5 = new int[3] {1,2,3}; //error: ';' expected
    // // System.out.println(Arrays.toString(arr0)); //error: variable arr0 might not have been initialized
    // System.out.println(Arrays.toString(arr1));
    // System.out.println(Arrays.toString(arr3));
    // System.out.println(Arrays.toString(arr4));

    // String[] strings = { "string","anotherstring"};
    // Object[] objects = strings;
    // objects[1] = "onemore";
    // System.out.println(Arrays.toString(strings));
    // System.out.println(Arrays.toString(objects));
    // String[] backtostr = (String[]) objects;
    // // objects[0] = new StringBuilder(); //runtimeerror java.lang.ArrayStoreException
    // String[] mammals = {"monkey","donkey","chimp"};
    // System.out.println(mammals.length);

    // int[] nums = {0,1,21,34,76,5,3,2,7,6,9,4,8,10,11,12};
    // String[] strs = {"1","21","34","76","5","3","2","7","6","9","4","8","10","11","12"};
    // System.out.println("int[]: "+Arrays.toString(nums));
    // System.out.println("String[]: "+Arrays.toString(strs));
    // Arrays.sort(nums);
    // Arrays.sort(strs);
    // System.out.println("Arrays.sort(nums); "+Arrays.toString(nums));
    // System.out.println("Arrays.sort(strs); "+Arrays.toString(strs));
    // System.out.println("Arrays.binarySearch(nums,21); "+Arrays.binarySearch(nums,21));
    // System.out.println("Arrays.binarySearch(nums,20); "+Arrays.binarySearch(nums,20));


    // int[][] nums = {{0,1,21},{34,76,5},{3,2,7},{6,9,4},{8,10,11},{12}};
    // System.out.println("int[]: "+Arrays.toString(nums));
    // ArrayList<Number> list1 = new ArrayList<>();
    // System.out.println(list1);
    // list1.add(1);
    // System.out.println(list1);
    // list1.add(2.0);
    // System.out.println(list1);
    // list1.add(0,3);
    // System.out.println(list1);
    // list1.add((long)(Math.pow(2,65)));
    // System.out.println(list1);
    // Object obj = list1.remove(3);
    // Object obj2 = list1.remove(((double) 2.0));
    // System.out.println(obj);
    // System.out.println(obj2);
    // System.out.println(list1);
  // }

  static boolean isAnagram(String a, String b) {
      char[] arr1 = a.toCharArray();
      char[] arr2 = b.toCharArray();
      java.util.Arrays.sort(arr1);
      java.util.Arrays.sort(arr2);
      String c = new String(arr1);
      String d = new String(arr2);
      System.out.println(c);
      System.out.println(d);
      if (c.equalsIgnoreCase(d)) return true;
      return false;
  }

public static void main(String[] args) {

          Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(str.length());
  //String[] strr = str.split("\\W+");
//  System.out.println(strr.length);
  //for(String a: strr) {
    //  System.out.println(a);
  //}
  }

}

class Mutable {
  private String s;
    public Mutable(String s){
      this.s = s;
    }
    public void setS(String s){
      this.s = s;
    }
    public String getS() {
      return s;
    }
}

final class Immutable {
  private String s;
    public Immutable(String s){
      this.s = s;
    }
    public String getS() {
      return s;
    }
}
