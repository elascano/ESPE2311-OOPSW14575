package ec.edu.espe.zoo.model;

import java.util.Date;

public class Mollusk extends Invertebrate {
    private String shellMaterial;
    private boolean isEdible;

    public Mollusk(int id, String scientificName, Date bornDate, int cageId, boolean hasExoskeleton, int numberOfLegs,
            boolean isAquatic, boolean hasJoints, String shellMaterial, boolean isEdible) {
        super(id, scientificName, bornDate, cageId, hasExoskeleton, numberOfLegs, isAquatic, hasJoints);
        this.shellMaterial = shellMaterial;
        this.isEdible = isEdible;
    }

    public void producePearl() {
        System.out.println("     The mollusk produces a pearl...");
    }

    public void filterFeed() {
        System.out.println("    The mollusk filters it's feed...");
    }

    public String getShellMaterial() {
        return shellMaterial;
    }

    public void setShellMaterial(String shellMaterial) {
        this.shellMaterial = shellMaterial;
    }

    public boolean isEdible() {
        return isEdible;
    }

    public void setEdible(boolean isEdible) {
        this.isEdible = isEdible;
    }
}
