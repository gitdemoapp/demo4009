/*
    Polymorphsim:
    -------------
    Why?
    To acheive flexibility .
      One name different form or one name different behaviour is the concept of Polymorphsim.
    How?

    We can acheive Polymorphsim by 2 ways:

  a) Compiletime Polymorphism  | Early Binding | static Polymorphism
          |-Overloading
          |-Method Hiding
  b) Runtime Polymorphism | Late Binding | Dynamic Polymorphism
          |-Overriding

     JVM:

  a) Compiletime Polymorphism :
  -----------------------------
    Compiler:-

    In C programming language

    add2(int  a,int  b){


  }

  add1(int  a, int  b,int  c){


}

    Overloading:
    -----------

     a)Number of argument

  void   m1(int  a){


   }

   void   m1(int  a,int  b){


    }


    b) Type of argument:

    void m1(int  a){


  }

  void m1(String  a){


}

c) Order of argument:

   void  m1(String  s,int   a){



 }

 void  m1(int  a, String  s){


}






class User{

  void  registration(String  emailID){


    }

  void  registration(long phoneNumber){


  }

}
Case-1:  automatic promotions in Overloading:
----------------------------------------------
byte-->short-->int--->long--->float--->double

     char--->int

*/

class OLDemo1{

     void  m1(long  l){

       System.out.println("this is m1(long)");
     }

     void  m2(long  a){

       System.out.println("this is m1(int)");
     }
}

class PolyDemo2{
  public static void main(String[] args) {
     OLDemo1  obj1=new OLDemo1();
     obj1.m1(101);
  }
}
