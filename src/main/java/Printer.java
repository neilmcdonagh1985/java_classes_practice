public class Printer {

    private int pagesLeft;
    private int toner;

    public Printer(int pagesLeft, int toner){
        this.pagesLeft = pagesLeft;
        this.toner = toner;
    }

    public int getPagesLeft(){
        return this.pagesLeft;
    }

    public int getToner(){
        return this.toner;
    }

    public int print(int numOfPages, int copies){
        int pagesPrinted = numOfPages * copies;
        if (pagesPrinted < pagesLeft) {
            return this.pagesLeft - pagesPrinted;
        }
        return this.pagesLeft;
    }

    public int useToner(int numOfPages, int copies){
        int tonerLeft = this.print(numOfPages, copies);
        return tonerLeft;
    }

}
