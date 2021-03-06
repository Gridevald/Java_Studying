package org.home.chapter08.partA.planet;

import java.util.Objects;

public class Island {
    
    private String name;
    
    private double square;
    
    /**
     * Constructors
     */
    
    public Island(){
    }
    
    public Island(String name){
        setName(name);
    }
    
    public Island(double square) {
        setSquare(square);
    }
    
    public Island(String name, double square) {
        setName(name);
        setSquare(square);
    }
    
    /**
     * Getters & Setters
     */
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            throw new NullPointerException("Island name is null");
        }
    }
    
    public double getSquare() {
        return square;
    }
    
    public void setSquare(double square) {
        if (square > 0) {
            this.square = square;
        } else {
            throw new IllegalArgumentException("Island square is " + square);
        }
    }
    
    /**
     * Methods
     */
    
//    @Override
//    public String toString() {
//        return getClass().getName() + " # name " + name;
//    }


    @Override
    public String toString() {
        return "Island{" +
                "name='" + name + '\'' +
                ", square=" + square +
                '}';
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Island)) return false;
        Island island = (Island) object;
        return Double.compare(island.getSquare(), getSquare()) == 0 &&
                Objects.equals(getName(), island.getName());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSquare());
    }
}
