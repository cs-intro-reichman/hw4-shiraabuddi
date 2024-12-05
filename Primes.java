

public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        final int N = Integer.parseInt(args[0]);
        int index = 2;
        int counter = 0;
        boolean[] arr = new boolean[N+1];
        System.out.println("Prime numbers up to " + N + ":");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=true;
        }
        for (int i = 2; i < arr.length; i++) {
            index = i;
            while(index < arr.length){
                if( index+i<arr.length){
                    arr[index +i]=false;
                }
                index += i;
            }
            
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]== true){
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("There are " + counter + " primes between 2 and " + N + " (" + counter*100/N + "% are primes)");
    }
}