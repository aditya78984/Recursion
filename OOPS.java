// class Student{
//     String name ;
//     int rollNo ;
//     int[] marks = new int[3] ;
   
//     void setRollNo(int rollNo){
//         this.rollNo = rollNo ;
//     }
//     int getRollNo(){
//         return this.rollNo  ;
//     }
//      Student(Student s1){
//         this.name = s1.name ;
//         this.rollNo = s1.rollNo ;
//     }
//     Student(){
        
//         System.out.println("Constructor called");
//     }
// }

import java.util.Scanner;

public class OOPS {
    public static void main(String[] args) {
        // Student s1 = new Student() ;
        // s1.name = "Aditya" ;
        // s1.marks[0] = 8 ;
        // s1.marks[0] = 8 ;
        // s1.setRollNo(6);
        // Student s2 = new Student(s1);
        // System.out.println(s2.getRollNo());


        // Queen q = new Queen();
        // q.moves();

        Bear b = new Bear();
        b.eat();

        // A.sayHello();

        // B obj = new B();

        Complex n1 = new Complex();
        Complex n2 = new Complex();
        n1.add(n2);



    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal (in all 4 dirns)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal (by 1 step)");
    }
}

interface Carnivore{
    String name1 ="Bear";
    void eat();
}
interface Herbivore{
    String name ="Bear";
    void eat();
}
class Bear implements Carnivore, Herbivore{
    
    @Override
    public void eat(){
        System.out.println("eat meat as well as fruits "+name);
    }
    
}

class A{
    static void sayHello(){
        System.out.println("Hello");
    }
    A(){
        System.out.println("A constructor called");
    }
}
class B extends A{
    B(){
        System.out.println("B constructor called");
    }
}

class Complex{
    int real;
    int imag;
    Complex(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real part : ");
        this.real = sc.nextInt();
        System.out.println("Enter the imaginary part : ");
        this.imag = sc.nextInt();
        System.out.println("Complex no. : " + this.real + " + i" + this.imag);
    }
    void add(Complex b){
        int rSum = this.real + b.real ;
        int iSum = this.imag + b.imag ;
        System.out.println(rSum + " + i" + iSum );
    }
}