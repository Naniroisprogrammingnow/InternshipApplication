package DevCampLogo;

public class TopPart extends Logo{
    private int fsTopLeft;
    private int lpTopLeft;
    private int fsTopMiddle;
    private int lpTopMiddle;
    private int fsTopRight;
    private int lpTopRight;
    
    public TopPart(int n) {
        super(n);
        this.fsTopLeft = super.getBase();
        this.lpTopLeft = (int) Math.ceil(super.getBase()/2.0);
        this.fsTopMiddle = super.getBase();
        this.lpTopMiddle = (int) Math.floor(super.getBase()/2.0);
        this.fsTopRight = super.getBase();
        this.lpTopRight = (int) Math.ceil(super.getBase()/2.0);
    }

    public void execute(){
        //I do the top part of the M letter twice
        for (int i = 0; i < (super.getBase()+1)/2; i++) {
            for (int j = 0; j < 2; j++) {
                oneMLetterTop(fsTopLeft, lpTopLeft, fsTopMiddle, lpTopMiddle, fsTopRight, lpTopRight);
            }

            //stepp 4 - change parameters before moving to the bottom row
            this.fsTopLeft--;
            this.lpTopLeft++;
            this.lpTopMiddle++;
            this.fsTopMiddle -=2;
            this.fsTopRight--;
            this.lpTopRight++;
            System.out.println();

        }
    }

    private void oneMLetterTop(int fsTopLeft, int lpTopLeft, int fsTopMiddle, int lpTopMiddle, int fsTopRight, int lpTopRight) {
        //every letter M can be divided into three thirds along the thickest part in the center jist before the legs divide
        printTopLeftThird(fsTopLeft, lpTopLeft); //right sided trapezoid of *
        printTopMiddleThird(fsTopMiddle, lpTopMiddle); //reverse triangle of -
        printTopRightThird(fsTopRight, lpTopRight); //left sided trapezoid of *

    }

    private void printTopRightThird(int fsTopRight, int lpTopRight) {
        //step3
        Printer.printLetterPart(lpTopRight);
        Printer.printFreeSpace(fsTopRight);
    }

    private void printTopMiddleThird(int fsTopMiddle, int letterPartOne) {
        //Step2
        Printer.printLetterPart(letterPartOne);
        printTopLeftThird(fsTopMiddle, letterPartOne);
    }

    private void printTopLeftThird(int fsTopLeft, int lpTopLeft) {
        //   Step1
        Printer.printFreeSpace(fsTopLeft);
        Printer.printLetterPart(lpTopLeft);
    }


}
