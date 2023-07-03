public class ProcessingArrays_RandomShuffling {
    public static void main(String[] args) {
        // Create an array
        float[] mylist = new float[5];
        
        // Initialize array with random values
        for (int i = 1; i < mylist.length; i++) {
            mylist[i] = (float)Math.random()*10;
        }

        // Display an array
        System.out.println("Array before shuffling:");
        for (int i = 0; i < mylist.length; i++) {
            System.out.print(mylist[i] + " ");
        }
        
        // Swap mylist[i] with mylist[j]
        System.out.println("\nArray after shuffling: ");
        for (int i = 0; i < mylist.length; i++) {
            int j = (int)(Math.random() * mylist.length);
            
            float temp = mylist[i];
            mylist[i] = mylist[j];
            mylist[j] = temp;
            System.out.print( mylist[i] + " ");
        }
    }
}
