public class Tester{

  //range tester
  public static void main(String[] args){
    IntegerSequence s = new Range(1,10);
    while(s.hasNext()){
      System.out.print(s.next());
      if (s.hasNext()) System.out.print(", ");
    }
    System.out.println();

  //array sequence tester
    int[] nums = {1,3,5,0,-1,3,9};
    IntegerSequence as = new ArraySequence(nums);

    System.out.println("ArraySequence(array):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }

    System.out.println();

    IntegerSequence r = new Range(10,20);
    IntegerSequence as2 = new ArraySequence(r);

    System.out.println("ArraySequence(seq):");
    while(as2.hasNext()){
      System.out.print(as2.next()+", ");
    }
    System.out.println();
  }
}

