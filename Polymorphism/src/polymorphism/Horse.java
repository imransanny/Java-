
package polymorphism;

public class Horse extends Anmal{

@Override
public void sound(){
  System.out.println("Neigh");
  }
public static void main(String args[]){
    Anmal obj = new Horse();
    obj.sound();
}

}

    

