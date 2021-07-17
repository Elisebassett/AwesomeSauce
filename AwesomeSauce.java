package AwesomeSauce;

public class AwesomeSauce {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
	        String awesome = "Awesome";
            String sauce = "Sauce";
            Boolean three_multiple = i % 3 == 0;
            Boolean five_multiple = i % 5 == 0;

            if (three_multiple && five_multiple) {
                System.out.println(awesome + sauce);
                continue;
            } else if (three_multiple) {
                System.out.println(awesome);
            } else if (five_multiple) {
                System.out.println(sauce);
            } else {    
                System.out.println(i);
            }
	    }
    }
}
