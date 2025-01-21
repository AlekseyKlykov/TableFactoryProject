package hw03_TableFactory;


import lombok.*;

@Getter
@Setter
@ToString
@Builder
@Value
public class BarTable {

    Component tableTop;
    Component box;
    boolean wirelessCharging;
    boolean cableDuct;
    boolean usbConnector;
    boolean beerDispenser;


}
