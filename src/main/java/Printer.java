public class Printer {
    public int paper;
    public int toner;


    public Printer() {
        this.paper = 100;
        this.toner = 20;
    }


    public int paperVolume() {
        return this.paper;
    }

    public int tonerVolume() {
        return this.toner;
    }


    public int print(int pages, int copies) {
        return this.paper - (pages * copies);
    }
}

//    public int refillPrinterPaper(){
//        if (this.paper <= 1){
//           return this.paper += 200;
//        } else {
//            return this.paper;
//        }
//    }
//}
