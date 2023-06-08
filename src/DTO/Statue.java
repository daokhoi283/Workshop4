package DTO;
import java.util.Scanner;
public class Statue extends Item {
    public int weight;
    public String colour;
    public Statue(){
        super();
    };
    public Statue(int value, String creater,  int weight, String colour){
        super(value, creater);
        this.weight = weight;
        this.colour = colour;
    }
    public int getWeight(){
        return this.weight;
    }
    public String getColour(){
        return this.colour;
    }
    public void setWeight(int height){
        this.weight = height;
    }
    public void setColour(String material){
        this.colour = material;
    }
    public void inputStatue(){ 
        super.input();
        try { 
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.print("Enter weight: ");
                this.weight = Integer.parseInt(scanner.nextLine()); 
                System.out.print("Enter colour: ");
                this.colour = scanner.nextLine();
            } while (weight < 0 || colour == null);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect information format, please enter again!");
        }
    }
    public void outputStatue(){
        super.output();
        System.out.println("Weight: " + this.weight);
        System.out.println("Colour: " + this.colour);
    }
    
}
