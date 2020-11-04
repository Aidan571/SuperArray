public class SuperArrayTester{
  public static void main(String[]args){
    SuperArray sa1 = new SuperArray();
    System.out.println(sa1.size());
    System.out.println(sa1.add("Hello"));
    System.out.println(sa1.get(0));
    System.out.println(sa1.get(1));
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
    SuperArray sa2 = new SuperArray(20);
  }
}
