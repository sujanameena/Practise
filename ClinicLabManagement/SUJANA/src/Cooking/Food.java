package Cooking;

public class Food {
    String name;
    int price;
    String[] ingredients = new String[4];

    public Food(String name, int price, String ingredient1,
                String ingredient2, String ingredient3,
                String ingredient4) {
        this.name = name;
        this.price = price;
        ingredients[0] = ingredient1;
        ingredients[1] = ingredient2;
        ingredients[2] = ingredient3;
        ingredients[3] = ingredient4;
    }


    public void show(){
        for (int i=0;i<ingredients.length;i++){
            System.out.println(ingredients[i]);
        }
    }


    public boolean contains(String ingredient) {
        for (int i = 0; i < ingredients.length; i++) {
            if (ingredients[i].equals(ingredient)) {
                return true;
            }
        }
        return false;
    }
}

