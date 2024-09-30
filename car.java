package javaBasic;
import java.util.*;


class Car{
    String model = "";
    int year;
    Engine engineObj = new Engine();
    Tyre[] tyreArr;
    Suspension suspensionObj = new Suspension();
    MusicSystem musicObj = new MusicSystem();
    
    Scanner sc = new Scanner(System.in);
    
    void inputDetails(){
        System.out.print("Enter the Car's model: ");
        this.model = sc.nextLine();
        System.out.print("Enter the year of manufacturing: ");
        this.year = sc.nextInt();
        
        tyreArr = new Tyre[4];
        for(int i = 0; i<4; i++){
            tyreArr[i] = new Tyre();
            tyreArr[i].inputDetails();
        }
        engineObj.inputDetails();
        suspensionObj.inputDetails();
        musicObj.inputDetails();
    }
    void outputDetails(){
        System.out.println("Car Model: "+this.model);
        System.out.println("Car Manufacturing year: "+this.year);
        for(int i = 0; i<4; i++){
            tyreArr[i].outputDetails();
        }
        engineObj.outputDetails();
        suspensionObj.outputDetails();
        musicObj.outputDetails();
    }
    
    void start(){
        engineObj.start();
    }
    void stop(){
        engineObj.stop();
    }
    void applyBrakes(){
        System.out.println("Brakes applied");
    }
    void playMusic(String song){
        musicObj.play(song);
    }
}

class Engine{
    String type = "";
    int cylinders;
    
    Scanner sc = new Scanner(System.in);
    
    void inputDetails(){
        System.out.print("Enter the type of Cylinder: ");
        this.type = sc.next();
        System.out.print("Enter the number of Cylinders: ");
        this.cylinders = sc.nextInt();
    }
    
    void outputDetails(){
        System.out.println("Engine Type: "+this.type);
        System.out.println("cylinders: "+this.cylinders);
    }
    
    void start(){
        System.out.println("Engine starts");
    }
    void stop(){
        System.out.println("Engine stops");
    }
}

class Tyre{
    String brand = "";
    int size;
    double pressure;
    Scanner sc = new Scanner(System.in);
    void inputDetails(){
        System.out.print("Enter Tyre's Brand: ");
        this.brand = sc.nextLine();
        System.out.print("Enter Tyre's size: ");
        this.size = sc.nextInt();
        System.out.print("Enter tyre's pressure: ");
        this.pressure = sc.nextDouble();
    }
    void outputDetails(){
        System.out.println("Tyre's Brand: "+this.brand);
        System.out.println("Tyre's Size: "+this.size);
        System.out.println("Tyte's pressure: "+this.pressure);
    }
}

class Suspension{
    String type = "";
    Scanner sc = new Scanner(System.in);
    void inputDetails(){
        System.out.print("Enter Suspension Type: ");
        this.type = sc.nextLine();
    }
    void outputDetails(){
        System.out.println("Suspension type: "+this.type);
    }
}

class MusicSystem{
    String brand = "";
    boolean isPlaying;
    Scanner sc = new Scanner(System.in);
    void inputDetails(){
        System.out.print("Enter MusicSystem brand: ");
        this.brand = sc.nextLine();
        System.out.print("Do you want to play it (true/false): ");
        this.isPlaying = sc.nextBoolean();
    }
    void outputDetails(){
        System.out.println("MusicSystem: "+this.brand);
        System.out.println("Playing");
    }
    
    void play(String song){
        this.isPlaying = true;
        System.out.println("Playing "+song);
    }
}

public class CarComposition {
    public static void main(String args[]){
        Car obj = new Car();
        obj.inputDetails();
        obj.outputDetails();
        obj.start();
        obj.stop();
        obj.applyBrakes();
        obj.playMusic("yaar nhi mileya");
    }
    
}
