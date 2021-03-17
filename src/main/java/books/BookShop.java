package books;

public class BookShop {

    private final String name;

    /**
     * Constructor of the class Book shop
     * @param name name of the book shop
     */
    public BookShop(String name){
        this.name = name;
    }

    /**
     * method to compute the cost of a basket
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    public double cost(int[] books){
        int differentBooks= 0;
        for (int book=0;book<books.length;book++){
            if (books[book]>0){
                differentBooks += 1;
                books[book]-=1;
            }
        }
        int discount =0;
        if(differentBooks==2){
            discount=7;
        }else if(differentBooks==3){
            discount=14;
        }else if(differentBooks==4){
            discount=28;
        }else if(differentBooks==5){
            discount=35;
        }
        discount= discount/100;
        double totalCost=0;
        for (int book=0;book<books.length;book++){
            totalCost=totalCost+8*books[book];
        }
        totalCost = totalCost+(differentBooks*8)*(1-discount);

        return totalCost;
    }
}
