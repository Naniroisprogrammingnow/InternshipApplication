package DevCampLogo;

public class MentorMateLogo extends Logo{
    //In this case the MM logo has two distinct patterns top and bottom
    private TopPart top;
    private BottomPart bottom;

    public MentorMateLogo(int n){
        super(n);
        this.top = new TopPart(n);
        this.bottom = new BottomPart(n);
    }

    @Override
    protected void execute() {
        this.top.execute();
        this.bottom.execute();
    }

}
