public class SuperArrayTester{
  public static String arrToString(String[] arr){
  String result = "{";
  if(arr.length == 0){
      return "{}";
    }
  for(int i = 0; i < arr.length; i++){
    if(i == arr.length-1){
      result = result + arr[i] + "}";
    }
    else
    result = result + arr[i] + ", ";
  }
  return result;
  }
  public static void main(String[]args){
    SuperArray sa1 = new SuperArray();
    System.out.println(sa1.size());
    System.out.println(sa1.add("Hello"));
    System.out.println(sa1.get(0));
    System.out.println(sa1.set(0,"Hey There"));
    System.out.println(sa1.get(0));
    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    System.out.println(words.size());
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }
    System.out.println(sa1.isEmpty());
    sa1.clear();
    System.out.println(sa1.isEmpty());
    sa1.add("Hello");
    sa1.add("Hey There");
    sa1.add("Hi");
    System.out.println(sa1.toString());
    System.out.println(sa1.contains("Hello"));
    System.out.println(sa1.contains("What's Up"));
    SuperArray sa2 = new SuperArray(3);
    sa2.add("Hello");
    sa2.add("Hi");
    sa2.add("Hey There");
    sa2.add("What's Up");
    sa2.add("Hola");
    System.out.println(sa2.toString());
    sa2.add(2,"Insert");
    System.out.println(sa2.toString());
    System.out.println(sa2.size());
    System.out.println(sa2.remove(2));
    System.out.println(sa2.toString());
    System.out.println(sa2.size());
    System.out.println(sa2.indexOf("Hi"));
    System.out.println(sa2.indexOf("Not Present"));
    String[] a1 = sa2.toArray();
    System.out.println(arrToString(a1));
    sa2.add("Hi");
    System.out.println(sa2.lastIndexOf("Hi"));
    System.out.println(sa2.lastIndexOf("Bonjour"));
    System.out.println(sa1.equals(sa2));
    SuperArray sa3 = sa1;
    System.out.println(sa1.equals(sa3));
    try{
      SuperArray crasher = new SuperArray(-2);
    }catch (IllegalArgumentException e){
      System.out.println("Initial Capacity can't be negative.");
    }
      try{
        sa1.get(-10);
      }catch (IndexOutOfBoundsException e){
        System.out.println("Index can't be negative");
      }
      try{
        sa1.get(100);
      }catch (IndexOutOfBoundsException e){
        System.out.println("Index can't be larger than size of the superarray");
      }
      try{
        sa1.set(-10, "Crash");
      }catch (IndexOutOfBoundsException e){
        System.out.println("Index can't be negative");
      }
      try{
        sa1.set(100, "Crash");
      }catch (IndexOutOfBoundsException e){
        System.out.println("Index can't be larger than size of the superarray");
      }
  }
}
