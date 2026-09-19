public class first {
    public static void main(String[] args) {
       BMW c1 = new BMW();
       c1.printCar();
    }
}

class Car{
    void printCar(){
        System.out.println("I can start");
    }
}

class Alto extends Car{
    void printAlto(){
        System.out.println("This is only car that you can afford");
    }

}

class BMW extends Alto{
    void printBMW(){
        System.out.println("Only Sayyed Muaaz can afford");
    }
}
