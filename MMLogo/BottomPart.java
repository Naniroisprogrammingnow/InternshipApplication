package DevCampLogo;

public class BottomPart extends Logo {

   private int fsBottomLeft; //fs stands for Free Space ("-")
   private int lpBottomLeft; //lp stands for Letter Part ("*")
   private int fsBottomMirror; //bottom mirror for the mirroring free space on the inner side of each leg

   private int fsBottomMiddle;
   private int lpBottomMiddle;

   private int fsBottomRight;
   private int lpBottomRight;

    public BottomPart(int base){
        super(base);
        this.fsBottomLeft = super.getBase()/2;
        this.lpBottomLeft = super.getBase();
        this.fsBottomMirror = 1;
        this.fsBottomMiddle = 0;
        this.lpBottomMiddle = 2*(super.getBase()-1)+1;
        this.fsBottomRight = super.getBase()/2;
        this.lpBottomRight = super.getBase();

    }

    @Override
    public void execute() {
        for (int i = 0; i < (super.getBase()+1)/2; i++) {
            for (int j = 0; j < 2; j++) {
                oneMLetterBottom(fsBottomLeft, lpBottomLeft, fsBottomMirror, fsBottomMiddle, lpBottomMiddle, fsBottomRight, lpBottomRight, i);
            }

            // step 4
            this.fsBottomMirror++;
            this.fsBottomMiddle++;
            this.lpBottomMiddle -=2;
            System.out.println();

        }
    }
    private void oneMLetterBottom(int fsBottomLeft, int lpBottomLeft, int fsBottomMirror,
                                         int fsBottomMiddle, int lpBottomMiddle, int fsBottomRight, int lpBottomRight, int row) {
        //like the top part of both M letters bottom has three thirds
        printBottomLeftThird(fsBottomLeft, lpBottomLeft, fsBottomMirror, row); //a rhombus with right slope for the left leg of *
        printBottomMiddleThird(fsBottomMiddle, lpBottomMiddle, fsBottomMiddle); //reverse trapezoid of *
        printBottomRightThird(fsBottomMirror, lpBottomRight, fsBottomRight - row); //another rhombus with left slope for the right leg


    }

    private void printBottomRightThird(int fsBottomMirror, int lpBottomRight, int row) {
        //step three
        Printer.printFreeSpace(fsBottomMirror);
        Printer.printLetterPart(lpBottomRight);
        Printer.printFreeSpace(row);
    }

    private void printBottomMiddleThird(int fsBottomMiddle, int lpBottomMiddle, int fsBottomTwo2) {
        //step two
        printBottomRightThird(fsBottomMiddle, lpBottomMiddle, fsBottomTwo2);
    }

    private void printBottomLeftThird(int fsBottomLeft, int lpBottomLeft, int fsBottomMirror, int row) {
        //Step one
        Printer. printFreeSpace(fsBottomLeft-row);
        Printer.printLetterPart(lpBottomLeft);
        Printer.printFreeSpace(fsBottomMirror);
    }
}
