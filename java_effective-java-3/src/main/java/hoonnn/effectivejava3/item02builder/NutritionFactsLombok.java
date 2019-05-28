package hoonnn.effectivejava3.item02builder;

import lombok.Builder;
import lombok.ToString;

/**
 * 아이템2 - 생성자에 매개변수가 많다면 빌더를 고려하라
 * <p>
 * https://projectlombok.org/features/Builder
 */
@Builder
@ToString
public class NutritionFactsLombok {
    private final Integer servingSize;
    private final Integer servings;
    private Integer calories;
    private Integer fat;
    private Integer sodium;
    private Integer carbohydrate;

    public NutritionFactsLombok(Integer servingSize, Integer servings) {
        this.servingSize = servingSize;
        this.servings = servings;
    }

    public static void main(String[] args) {
        NutritionFactsLombok cocaCola = NutritionFactsLombok.builder().build();
        System.out.println(cocaCola);
    }
}
