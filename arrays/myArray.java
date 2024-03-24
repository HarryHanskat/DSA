import java.lang.Iterable;
import java.util.Iterator;

import javax.sound.sampled.SourceDataLine;

// This is my attempt at recreating the Dynamic portion of the Array class in Java

@SuppressWarnings("unchecked")
public class myArray<T> implements Iterable<T> {

  // 'T' stands for Type, in the Iterable class.
  // It is defining what type of array this will be.
  private T[] arr;
  private int len = 0; // length user thinks the array is
  private int capacity = 0; // actual array size

  public myArray() { this(16); }

  public myArray(int capacity) {
    if (capacity < 0) throw new IllegalArgumentException("Illegal Capacity: " + capacity);
    this.capacity = capacity;
    arr = (T[]) new Object[capacity];
  }
  
  public int size() { return this.len; }
  
  public boolean isEmpty() { 
    return (len == 0);
  }

  // Using 'T' to define the type we expect to return
  public T get(int index) {
    return arr[index];
  }

  // Using 'T' to define the type of element we expect as a parameter
  public void set(int index, T element) {
    arr[index] = element;
  }

  public void clear() { 
    for(int i = 0; i < capacity; i++)
      arr[i] = null;
    len = 0;
  }

  /* 
    If the array is full (the last element is not null) we need to increase the size of the array.
    So how do we do that?
    1. Create a new array that's twice as long
    2. Copy elements from old array over to new array
    3. Add new element to the end of the new array
  */
  public void add(T element) { 
    if(arr[arr.length] != null){
      // Create temporary array that is double the size of 'capacity'
      T[] temp = (T[]) new Object[capacity*2];

      for(int i = 0; i < capacity; i++){
        temp[i] = arr[i];
      }

      temp[len+1] = element;      
      arr = temp;
    } else {
      arr[len+1] = element;
    }
  }

  /*
   
   */
  public void removeAt(int index) { 

  }
  
  public int indexOf(T element) { 
      for(int i = 0; i < capacity; i++){
        if(arr[i].equals(element)) return i;
      }
      return -1;
  }
  
  public boolean contains(T element) { 
    return false;
  }

  public String toString() { 
    return "";
  }

  @Override
  public Iterator<T> iterator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'iterator'");
  }
}
