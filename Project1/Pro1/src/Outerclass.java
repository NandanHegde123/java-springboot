class OuterClass {
    int x = 10;
  
    static class  InnerClass {
      public int myInnerMethod(OuterClass outer) {
        return outer.x;
      }
    }
   
    public static void main(String[] args){
      InnerClass i3=new InnerClass();
      OuterClass outer=new OuterClass();
      System.err.println(i3.myInnerMethod(outer));

    }
  }
  
