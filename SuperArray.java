public class SuperArray{
  private String [] data;
  private int size;

  public SuperArray(){
    size = 0;
    data = new String [10];
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    if(this.size() < data.length){
      data[this.size()] = element;
      size += 1;
      return true;
    }
    return false;
  }

  public String get(int index){
    if(index >= 0 && index <= (this.size() - 1)){
      return data[index];
    }
    return "No value at the given index.";
  }

  public String set(int index, String element){
    if(index >= 0 && index <= (this.size() - 1)){
      String holder = this.get(index);
      data[index] = element;
      return holder;
    }
    return "No value at the given index.";
  }
}
