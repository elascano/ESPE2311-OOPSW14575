package ec.edu.espe.zoo.model;

import java.util.Date;

public class Oyster extends Mollusk {
    private boolean isAttachedToSubstrate;
    private String substrateType;

    public Oyster(int id, String scientificName, Date bornDate, int cageId, boolean hasExoskeleton, int numberOfLegs,
            boolean isAquatic, boolean hasJoints, String shellMaterial, boolean isEdible, boolean isAttachedToSubstrate,
            String substrateType) {
        super(id, scientificName, bornDate, cageId, hasExoskeleton, numberOfLegs, isAquatic, hasJoints, shellMaterial,
                isEdible);
        this.isAttachedToSubstrate = isAttachedToSubstrate;
        this.substrateType = substrateType;
    }

    public void produceNacre() {
        System.out.println("    The oyster is producing nacre...");
    }

    public void adhereToSurface() {
        System.out.println("    The oyster is getting adhered to a surface...");
    }

    @Override
    public void producePearl() {
        System.out.println("    The oyster is producing a beautiful pearl for jewerly...");
    }

    public void producePearl(String color) {
        System.out.println("    The oyster is producing a nice " + color + " pearl...");
    }

    public boolean isAttachedToSubstrate() {
        return isAttachedToSubstrate;
    }

    public void setAttachedToSubstrate(boolean isAttachedToSubstrate) {
        this.isAttachedToSubstrate = isAttachedToSubstrate;
    }

    public String getSubstrateType() {
        return substrateType;
    }

    public void setSubstrateType(String substrateType) {
        this.substrateType = substrateType;
    }
}
