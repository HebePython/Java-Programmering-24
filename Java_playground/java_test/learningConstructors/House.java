package Java_playground.java_test.learningConstructors;

public class House {
    int squareMeters;
    int floors;
    int worth;
    int year;
    String adress;

    House(int squareMeters, int floors, int worth, int year, String adress){
        this.squareMeters = squareMeters;
        this.floors = floors;
        this.worth = worth;
        this.year = year;
        this.adress = adress;
    }

    House(){
        
    }

    public void printMyHouseDetails() {
        System.out.println(String.format("The house has %d square meters\nIt has %d floors\nIt's worth $%d\nIt was built in %d\nAdress is %s", this.squareMeters, this.floors, this.worth, this.year, this.adress));
    }
    
}



class main{

    public static void main(String[] args) {
        House myHouse1 = new House(300, 3, 150000, 1991, "22 Leighton str.");
        myHouse1.printMyHouseDetails();

    }
}
