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

  public String get(int index){
    if(index < 0){
      throw new IndexOutOfBoundsException("Index " + index + " can not be negative");
    }
    else if(index >= this.size()){
      throw new IndexOutOfBoundsException("Index " + index + " can not be larger than the size of the superarray");
    }
    return data[index];
  }

  public String set(int index, String element){
    if(index < 0){
      throw new IndexOutOfBoundsException("Index " + index + " can not be negative");
    }
    else if(index >= this.size()){
      throw new IndexOutOfBoundsException("Index " + index + " can not be larger than the size of the superarray");
    }
    String holder = this.get(index);
    data[index] = element;
    return holder;
  }

  private void resize(){
    String [] bigger = new String [(data.length + 1) * 2];
    for(int i = 0; i < data.length; i++){
      bigger[i] = data[i];
    }
    data = bigger;
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
    if(initialCapacity < 0){
      throw new IllegalArgumentException("InitialCapacity " + initialCapacity + " cannot be negative");
    }
    size = 0;
    data = new String[initialCapacity];
  }

  public void add(int index, String element){
    this.add(data[size - 1]);
    String holder = data[index];
    String holder2;
    for(int i = index; i < size - 1; i++){
      holder2 = data[i + 1];
      data[i + 1] = holder;
      holder = holder2;
    }
    data[index] = element;
  }

  public String remove(int index){
    String holder = data[size - 1];
    String holder2;
    String returnValue = data[index];
    for(int i = size - 1; i > index; i--){
      holder2 = this.get(i - 1);
      data[i - 1] = holder;
      holder = holder2;
    }
    size -= 1;
    return returnValue;
  }

  public int indexOf(String s){
    for(int i = 0; i < size; i++){
      if(data[i].equals(s)){
        return i;
      }
    }
    return -1;
  }

  public String[] toArray(){
    String[] result = new String[size];
    for(int i = 0; i < size; i++){
      result[i] = data[i];
    }
    return result;
  }

  public int lastIndexOf(String value){
    for(int i = this.size() - 1; i >= 0; i--){
      if(this.get(i).equals(value)){
        return i;
      }
    }
    return -1;
  }

  public boolean equals(SuperArray other){
    int size;
    if(other.size() > this.size()){
      size = this.size();
    }
    else
    size = other.size();
    for(int i = 0; i < size; i++){
      if(this.get(i).equals(other.get(i))){
      }
      else
      return false;
    }
    return true;
  }
}
