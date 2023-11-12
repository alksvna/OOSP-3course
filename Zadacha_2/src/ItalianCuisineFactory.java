 class ItalianCuisineFactory extends CuisineFactory {
    Dish createDish(){
        return new Pizza();
    }
}
