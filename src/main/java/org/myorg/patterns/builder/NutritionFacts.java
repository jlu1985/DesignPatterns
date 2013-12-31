package org.myorg.patterns.builder;

/**
 *
 * @author Jia Lu
 */
public class NutritionFacts {

    private final int servingSize;
    private final int serving;
    private final int calories;
    private final int fat;
    private final int sodium;

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        serving = builder.serving;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
    }

    public static void main(String[] args) {
        NutritionFacts n = new NutritionFacts.Builder(200, 1).calories(150).fat(2).build();
    }

    public static class Builder {

        private final int servingSize;
        private final int serving;
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;

        public Builder(int servingSize, int serving) {
            this.servingSize = servingSize;
            this.serving = serving;
        }

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }
}
