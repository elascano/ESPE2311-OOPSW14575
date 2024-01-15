package ec.edu.espe.zoo.model;

import java.util.Date;

public class Mussel extends Mollusk {
    private boolean hasByssalThread;
    private double threadLength;

    public Mussel(int id, String scientificName, Date bornDate, int cageId, boolean hasExoskeleton, int numberOfLegs,
            boolean isAquatic, boolean hasJoints, String shellMaterial, boolean isEdible, boolean hasByssalThread,
            double threadLength) {
        super(id, scientificName, bornDate, cageId, hasExoskeleton, numberOfLegs, isAquatic, hasJoints, shellMaterial,
                isEdible);
        this.hasByssalThread = hasByssalThread;
        this.threadLength = threadLength;
    }

    public void attachToSubstrate() {
        System.out.println("    The mussel is getting attached to the substrate...");
    }

    public void suspensionFeed() {
        System.out.println("    The mussel has suspended it's feed...");
    }

    public boolean isHasByssalThread() {
        return hasByssalThread;
    }

    public void setHasByssalThread(boolean hasByssalThread) {
        this.hasByssalThread = hasByssalThread;
    }

    public double getThreadLength() {
        return threadLength;
    }

    public void setThreadLength(double threadLength) {
        this.threadLength = threadLength;
    }
}
