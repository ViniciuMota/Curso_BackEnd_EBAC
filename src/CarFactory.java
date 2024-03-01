public class CarFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        switch (requestedGrade){
            case "A":
                return new Volkswagem(500, "full", "blue");
            case "B":
                return new Toyota(300,"full","red");
            default:
                System.out.println("The requested car was unfortunately not available");
                return null;

        }
    }
}
