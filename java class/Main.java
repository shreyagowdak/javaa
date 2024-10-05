class bird {
  void fly() {
    System.out.println("bird can fly");
  }
}

class parrot extends bird {
  void color() {
    System.out.println("i am green");
  }
}

class singleparrot extends bird {
  void sing() {
    System.out.println("i can sing");
  }
}
class cow extends bird{
    void  whatcolor() {
      System.out.println("i am white");
    }
  }
public class Main{

  public static void main(String[] args) {
    parrot p = new parrot();
    singleparrot sp = new  singleparrot();
    cow c = new cow();
    p.fly();
    p.color();
    sp.sing();
    c.whatcolor();
  }
}
class A{
  void testMethod(){

  }
}
  class B{
    void Method(){

    }
  }
  class C extends A,B{
  }
