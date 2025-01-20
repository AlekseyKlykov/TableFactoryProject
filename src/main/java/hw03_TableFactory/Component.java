package hw03_TableFactory;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Setter

public class Component {
    String material;
    String color;
    int qty;
    float maximumLoad;


}
