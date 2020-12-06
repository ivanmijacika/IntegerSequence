public class Tester{
  public static void main(String[] args){
    IntegerSequence s = new Range(1,10);
    while(s.hasNext()){
      System.out.print(s.next());
      if (s.hasNext()) System.out.print(", ");
    }
    System.out.println();
  }
}
