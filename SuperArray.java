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
    this.resize();
    data[this.size()] = element;
    size += 1;
    return true;
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

  private void resize(){
    String [] bigger = new String [data.length + 1];
    for(int i = 0; i < data.length; i++){
      bigger[i] = data[i];
    }
    data = bigger;
  }

  public boolean isEmpty(){
    return size == 0;
  }

  public void clear(){
    size = 0;
    data = new String[data.length];
  }

  public String toString(){
    String result = "[";
    for(int i = 0; i < size - 1; i++){
      result = result + data[i] + ", ";
    }
    return result + data[size - 1] + "]";
  }

  public boolean contains(String s){
    for(int i = 0; i < size; i++){
      if(data[i].equals(s)){
        return true;
      }
      else
      return false;
    }
    return false;
  }

  public SuperArray(int initialCapacity){
    size = 0;
    data = new String[initialCapacity];
  }
}
