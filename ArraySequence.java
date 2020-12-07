import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{

  int currentIndex;
  int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] other){
    data = other;
    currentIndex = 0;
  }

  public boolean hasNext(){
    return false;
  }

  public int next(){
    return 0;
  }

  public int length(){
    return 0;
  }

  public void reset(){
    
  }

}
