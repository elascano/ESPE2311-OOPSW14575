package ec.edu.espe.q3851.model;

public class G implements H {
    @Override
    public String toString() {
        return "G [j=" + j + "]";
    }

    public G() {
    }

    public G(J j) {
        this.j = j;
    }

    private J j = null;

    public J getJ() {
        return j;
    }

    public void setJ(J j) {
        this.j = j;
    }
}
