package DTO;
import java.util.Scanner;
public class Painting extends Item {
    public int height;
    public int width;
    public boolean isWatercolour;
    public boolean isFramed;
    public Painting(){
        super();
    };
    public Painting(int value, String creater, int height,int width, boolean isWatercolour, boolean isFramed){
        super(value, creater);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }
    public int getHeight(){
        return this.height;
    }
    public int getWidth(){
        return this.width;
    }
    public boolean getIsWatercolour(){
        return this.isWatercolour;
    }
    public boolean getIsFramed(){
        return this.isFramed;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void setIsWatercolour(boolean isWatercolour){
        this.isWatercolour = isWatercolour;
    }
    public void setIsFramed(boolean isFramed){
        this.isFramed = isFramed;
    }
    public void inputPainting(){ 
        super.input();
        try {
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.print("Enter height: ");
                this.height = Integer.parseInt(scanner.nextLine()); 
                System.out.print("Enter width: ");
                this.width = Integer.parseInt(scanner.nextLine());
            } while (height < 0 || width < 0);
            System.out.print("Enter isWatercolour: ");
            this.isWatercolour = Boolean.parseBoolean(scanner.nextLine());
            System.out.print("Enter isFramed: ");
            this.isWatercolour = Boolean.parseBoolean(scanner.nextLine());
        } catch (Exception e) {
        }
    }
    public void outputPainting(){
        super.output();
        System.out.println("Height: " + this.height);
        System.out.println("Width: " + this.width);
        System.out.println("IsWatercolour: " + this.isWatercolour);
        System.out.println("IsFramed: " + this.isFramed);
    }
    
}
