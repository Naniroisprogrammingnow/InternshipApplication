package DevCampLogo;

public abstract class Logo {
    private int base;
    protected Logo(int n){
        this.setBase(n);
    }

    protected int getBase() {
        return base;
    }

    protected abstract void execute();

    protected void setBase(int base) {
        if (base>0 && base%2==1){
            this.base = base;
        }else {
            throw new IllegalArgumentException("Logo base must be a positive odd number.");
        }
    }
}
