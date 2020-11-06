public class Demo{
  public static void removeDuplicates(SuperArray s){
    for(int i = 0; i < s.size(); i++){
      for(int j = s.size() - 1; j > i; j--){
        if(s.get(i).equals(s.get(j))){
          s.remove(j);
        }
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray result = new SuperArray();
    removeDuplicates(a);
    removeDuplicates(b);
    int size;
    int smallerSize;
    if(a.size() > b.size()){
      size = a.size();
      smallerSize = b.size();
    }
    else {
    size = b.size();
    smallerSize = a.size();
  }
    for(int i = 0; i < size; i++){
      for(int j = 0; j < smallerSize; j++){
        if(a.get(i).equals(b.get(j))){
          result.add(a.get(i));
        }
      }
    }
    return result;
  }

  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray result = new SuperArray();
    int size;
    int smallerSize;
    if(a.size() > b.size()){
      size = a.size();
      smallerSize = b.size();
      for(int i = 0; i < size; i++){
        result.add(a.get(i));
        if(i < smallerSize){
          result.add(b.get(i));
        }
      }
    }
    else {
    size = b.size();
    smallerSize = a.size();
    for(int i = 0; i < size; i++){
      if(i < smallerSize){
        result.add(a.get(i));
      }
      result.add(b.get(i));
    }
  }
  return result;
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);

    SuperArray sa1 = new SuperArray();
    SuperArray sa2 = new SuperArray();
    sa1.add("9");
    sa1.add("1");
    sa1.add("2");
    sa1.add("2");
    sa1.add("3");
    sa1.add("4");
    sa2.add("0");
    sa2.add("4");
    sa2.add("2");
    sa2.add("2");
    sa2.add("9");
    System.out.println(findOverlap(sa1,sa2).toString());
    SuperArray sa3 = new SuperArray();
    SuperArray sa4 = new SuperArray();
    sa3.add("a");
    sa3.add("b");
    sa3.add("c");
    sa3.add("d");
    sa3.add("e");
    sa3.add("f");
    sa4.add("0");
    sa4.add("1");
    sa4.add("2");
    sa4.add("3");
    System.out.println(zip(sa3,sa4).toString());
    sa4.add("4");
    sa3.remove(5);
    sa3.remove(4);
    sa3.remove(3);
    System.out.println(zip(sa3,sa4).toString());
    }
}
