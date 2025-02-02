public class Question1 {
    public static void main(String[] args) {
        try {
            // NullPointerException Example
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException
            
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after NullPointerException.");
        }

        try {
            // ArrayIndexOutOfBoundsException Example
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // This will throw ArrayIndexOutOfBoundsException
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after ArrayIndexOutOfBoundsException.");
        }
    }
}
