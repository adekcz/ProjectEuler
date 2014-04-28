/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.helper;

/**
 *
 * @author Michal Keda
 */
public class Equation {
    private double a;
    private double b;
    private double c;
    private double discriminant;
    private double root1;
    private double root2;

    public double getDiscriminant() {
        return discriminant;
    }

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        discriminant = b*b-4*a*c;
        if(discriminant>=0){
            root1 =  (-b + Math.sqrt(discriminant))/(2*a);
            root2 =  (-b - Math.sqrt(discriminant))/(2*a);
        }
    }

    public double getA() {
        return a;
    }


    public double getB() {
        return b;
    }


    public double getC() {
        return c;
    }


    public double valueFor(double i) {
        return i * i * a + i * b + c;
    }

    @Override
    public String toString() {
        String solutions = "";
        if (hasSolutions()){
            solutions = "Solutions: ["+ root1 +", "+root2+ "]";

        }
        return a + "*x^2 + " + b + "*x + " + c +"\n"+solutions; //To change body of generated methods, choose Tools | Templates.
    }

    public boolean hasSolutions() {
        return discriminant>=0;
    }

    public boolean  hasIntegerSolution(){
        return hasSolutions() && (MathHelper.isInt(root1) || MathHelper.isInt(root2));
    }
    public boolean hasPositiveIntegerSolution(){
        return hasSolutions() && ((MathHelper.isInt(root1) && root1>0) || (MathHelper.isInt(root2) && root2>0));

    }

    public double getRoot1() {
        if (discriminant<0){
            throw new IllegalStateException("rovnice nema reseni");
        }
        return root1;
    }

    public double getRoot2() {
        if (discriminant<0){
            throw new IllegalStateException("rovnice nema reseni");
        }
        return root2;
    }
    
}
