package hw03_TableFactory;

import lombok.*;

@Builder
@ToString
@Value
@Getter
@Setter
public class UsualTable implements iUsualTable {
    Component tableTop;
    Component box;
    boolean wirelessCharging;
    boolean cableDuct;
    boolean usbConnector;
    boolean beerDispenser;

}
