public class oddEven {
    public static void main(String[] args) {
        int randomNumber = (int)(Math.random()*100);
        System.out.println("Random number is: " + randomNumber);

        if(randomNumber % 2 == 0){
            System.out.println("The number is even");
        } else{
            System.out.println("The number is odd");
        }
    }
}
