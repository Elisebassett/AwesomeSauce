package AwesomeSauce;

public class App {
    public static void main(String[] args) {
        App app = new App();
        for (int i = 1; i < 101; i++) {
            System.out.println(app.awesomeSauce("Awesome", "Sauce", i));
        }
    }

    public String awesomeSauce(String awesome, String sauce, int i) {
        
        boolean three_multiple = i % 3 == 0;
        boolean five_multiple = i % 5 == 0;

        if (three_multiple && five_multiple) {
           return awesome + sauce;
        } else if (three_multiple) {
            return awesome;
        } else if (five_multiple) {
            return sauce;
        } else {    
            return Integer.toString(i);
        }
    }
}
