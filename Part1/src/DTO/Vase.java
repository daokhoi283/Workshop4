package DTO;
import java.util.Scanner;
public class Vase extends Item {
    public int height;
    public String material; 
    public Vase(){
        super();
    };
    public Vase(int value, String creater, int height, String material){
        super(value, creater);
        this.height = height;
        this.material = material;
    }
    public int getHeight(){
        return this.height;
    }
    public String getMaterial(){
        return this.material;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setMaterial(String material){
        this.material = material;
    }
    public void inputVase(){ 
        super.input();
        try {
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.print("Enter weight: ");
                this.height = Integer.parseInt(scanner.nextLine()); 
                System.out.print("Enter material: ");
                this.material = scanner.nextLine();
            } while (height < 0 || material == null);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect information format, please enter again!");
        }
    }
    public void outputVase(){
        super.output();
        System.out.println("Height: " + this.height);
        System.out.println("Material: " + this.material);
    }

}
