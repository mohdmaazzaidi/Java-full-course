public class first {
    public static void main(String[] args) {
       BMW c1 = new BMW();
       c1.printAlto();
    }
}

class Car{
    int a = 200;
    void printCar(){
        System.out.println("I can start");
    }
}

class Alto extends Car{
    int a = 300;
    void printAlto(){
        System.out.println("This is only car that you can afford"+ super.a);
    }

}

class BMW extends Alto{
    void printBMW(){
        System.out.println("Only Sayyed Muaaz can afford");
    }
}
