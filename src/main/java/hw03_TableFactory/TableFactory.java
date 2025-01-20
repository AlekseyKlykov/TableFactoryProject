package hw03_TableFactory;



public class TableFactory implements iTableFactory {
    @Override
    public iBarTable createBarTable() {
        return BarTable.builder().tableTop(Component.builder()
                .color("Black")
                .material("Wood Veneer")
                .qty(1)
                .maximumLoad(140).build())
                .wirelessCharging(true)
                .beerDispenser(true)
                .usbConnector(true)
                .build();
    }

    @Override
    public iUsualTable createUsualTable() {
        return UsualTable.builder().tableTop(Component.builder()
                        .color("Black")
                        .material("Wood Veneer")
                        .qty(1)
                        .maximumLoad(90).build())
                .box(Component.builder()
                        .color("Black")
                        .material("Wood Veneer")
                        .qty(5)
                        .maximumLoad(35).build())

                .wirelessCharging(true)
                .beerDispenser(false)
                .usbConnector(true)
                .build();
    }
}
