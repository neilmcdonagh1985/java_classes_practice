public class Printer {

    private int pagesLeft;

    public Printer(int pagesLeft){
        this.pagesLeft = pagesLeft;
    }

    public int getPagesLeft(){
        return this.pagesLeft;
    }

    public int print(int numOfPages, int copies) {
        int pagesPrinted = numOfPages * copies;
        if (pagesPrinted < pagesLeft) {
            return this.pagesLeft - pagesPrinted;
        }
        return this.pagesLeft;

    }
}
