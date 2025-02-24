//circle class
package binarysearch;


public class Circle1 implements Comparable<Circle1> {
    private double radius;
    
    public Circle1(){
        radius = 0;
    }
    public Circle1(double r){
        radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        radius = r;
    }
    @Override
    public String toString(){
        return "Radius: "+radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
    @Override
    public int compareTo(Circle1 r){
   if(this.area()>r.area()) return 1;
   else if(this.area()<r.area()) return -1;
   else return 0;
  }
}
