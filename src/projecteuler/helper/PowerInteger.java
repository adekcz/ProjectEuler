/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.helper;

/**
 * don't use this class
 * @author Michal Keda
 */
class PowerInteger {
    private final int base;
    private final int exp;

    public PowerInteger(int base, int exp) {
        this.base = base;
        this.exp = exp;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.base;
        hash = 53 * hash + this.exp;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PowerInteger other = (PowerInteger) obj;
        if (this.base != other.base) {
            return false;
        }
        if (this.exp != other.exp) {
            return false;
        }
        return true;
    }

    public PowerInteger toThePower(int power){
        return new PowerInteger(base, exp*power);
    }

    public int getBase() {
        return base;
    }

    public int getExp() {
        return exp;
    }

    @Override
    public String toString() {
        return "PowerInteger{" + "base=" + base + ", exp=" + exp + '}';
    }

    

    
}
