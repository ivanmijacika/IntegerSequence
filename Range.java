import java.util.NoSuchElementException;
public class Range implements IntegerSequence{

  private int start,end,current;

  public Range(int start,  int end){
    this.start = start;
    this.end = end;
    current = start;
  }

  public void reset(){
    current = start;
  }

  public int length(){
    int l = end - start + 1;
    return l;
  }

  public boolean hasNext(){
    return (current <= end);
  }

  //@throws NoSuchElementException
  public int next(){
    if (!hasNext()) throw new NoSuchElementException("End of sequence.");
    else{
      current ++;
      return (current-1);
    }
  }

}
