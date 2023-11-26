package calc;

public class RecommendationFilter {


    public void filter (Classification classification){
        if (classification.getClassificacao() > 4){
          System.out.print("That is the goat! the goat!");
        } else if (classification.getClassificacao() >= 2){
            System.out.print("I mean it's all right");
        } else {
            System.out.println("Its the biggest piece of dog shit");
        }
    }

}
