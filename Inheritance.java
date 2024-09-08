public class Inheritance {

}

class Film {
    String title;
    double dailyRate;

    Film() {
        this.title = "";
        this.dailyRate = 0.0;
    }

    Film(String title, double dailyRate) {
        this.title = title;
        this.dailyRate = dailyRate;
    }

    double calculatePrice(int numDays) {
        if (numDays < 1) {
            return 0.0;
        }
        assert numDays >= 1;
        double price = numDays * dailyRate;
        return price;
    }

    void printstate() {
        System.out.println("Title: " + title);
        System.out.println("Daily Rate: " + dailyRate);
    }

    public static void main(String[] args) {
        Video videoobj = new Video("John Wick", 55.5);
        Dvd dvdobj = new Dvd("summer", 43.2);
        videoobj.printstate();
        dvdobj.printstate();
        videoobj.calculatePrice(2, 10.0);
        dvdobj.calculatePrice(10  );

    }


}

class Dvd extends Film {
    int zone;
    double deposit;
    final int DEPOSIT = 200;

    Dvd() {
        super();
        zone = 0;
        deposit = 0.0;
    }

    Dvd(String title, double dailyRate) {
        super(title, dailyRate);
    }

    double calculatePrice(int numDays) {
        double DVDPrice = super.calculatePrice(numDays);
        DVDPrice = DVDPrice - deposit;
        return DVDPrice;
    }

}

class Video extends Film {
    String videoType;

    Video() {
        super();
        videoType = "video";
    }

    Video(String title, double dailyRate) {
        super(title, dailyRate);
    }

    double calculatePrice(int numDays, double discount) {
        double vidPrice = super.calculatePrice(numDays);
        vidPrice = vidPrice - discount;
        System.out.println("The discount is " + discount + " and the final price is " + vidPrice);
        return vidPrice;
    }
}
