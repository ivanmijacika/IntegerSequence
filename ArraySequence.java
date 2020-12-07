import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{

  int currentIndex;
  int[] data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] other){
    data = other;
    currentIndex = 0;
  }

  public boolean hasNext(){
    return (currentIndex < data.length);
  }

  public int next(){
    if (hasNext()){
      currentIndex++;
      return data[currentIndex-1];
    }
    else throw new NoSuchElementException ("End of sequence reached.");
  }

  public int length(){
    return data.length;
  }

  public void reset(){
    currentIndex = 0;
  }

}
