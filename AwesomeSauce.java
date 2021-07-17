// Awesome Sauce program

class AwesomeSauce {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
	        if ( i % 3 == 0 ) {
	            System.out.println("Awesome");
	        } 
	        if (i % 5 == 0 ) {
	            System.out.println("Sauce");
	        } else {
	            System.out.println(i);
	        }
	    } 
    }
}
