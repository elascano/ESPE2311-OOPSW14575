package ec.edu.espe.zoo.model;

import java.util.Date;

public class Invertebrate extends Animal {
    private boolean hasExoskeleton;
    private int numberOfLegs;
    private boolean isAquatic;
    private boolean hasJoints;

    public Invertebrate(int id, String scientificName, Date bornDate, int cageId, boolean hasExoskeleton,
            int numberOfLegs, boolean isAquatic, boolean hasJoints) {
        super(id, scientificName, bornDate, cageId);
        this.hasExoskeleton = hasExoskeleton;
        this.numberOfLegs = numberOfLegs;
        this.isAquatic = isAquatic;
        this.hasJoints = hasJoints;
    }

    public void molt() {
        System.out.println("    The invertebrate is molting...");
    }

    public void crawl() {
        System.out.println("    The invertebrate is crawling...");
    }

    public boolean isHasExoskeleton() {
        return hasExoskeleton;
    }

    public void setHasExoskeleton(boolean hasExoskeleton) {
        this.hasExoskeleton = hasExoskeleton;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isAquatic() {
        return isAquatic;
    }

    public void setAquatic(boolean isAquatic) {
        this.isAquatic = isAquatic;
    }

    public boolean isHasJoints() {
        return hasJoints;
    }

    public void setHasJoints(boolean hasJoints) {
        this.hasJoints = hasJoints;
    }
}
