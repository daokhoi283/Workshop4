package DTO;
import java.util.Scanner;
public class Item {
    public int value;
    public String creater;
    public Item(){};
    public Item(int value, String creater){
        this.value = value;
        this.creater = creater;
    }
    public int getValue(){
        return  this.value;
    }
    public String getCreater(){
        return this.creater;
    }
    public void setValue(int value){
        this.value = value;
    }
    public void setCreater(String creater){
        this.creater = creater;
    }
    public void input(){
            try{
                do {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter value: ");
                    this.value = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter creater: ");
                    this.creater = scanner.nextLine();
                } while (this.value < 1 || this.creater == null);
            }
            catch(NumberFormatException e){
                System.out.println("Incorrect information format, please enter again!");
            }
    }
    public void output(){
        System.out.println("Value: " + this.value);
        System.out.println("Creater: " + this.creater);
    } 
}
