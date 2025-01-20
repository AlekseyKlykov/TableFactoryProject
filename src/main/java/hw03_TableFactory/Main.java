package hw03_TableFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        iTableFactory tableFactory = new TableFactory();
        iUsualTable usualTable = tableFactory.createUsualTable();

        System.out.println(usualTable);

        iBarTable barTable = tableFactory.createBarTable();

        System.out.println(barTable);

        System.out.println("-------------------------Objects from the withdrawal factory------------------------");


        BarTable barTable2 = BarTable.builder().tableTop(Component.builder()
                        .color("Black")
                        .material("Wood Veneer NEW")
                        .qty(1)
                        .maximumLoad(140).build())
                .wirelessCharging(true)
                .beerDispenser(true)
                .usbConnector(true)
                .build();


        System.out.println("-------------------------Objects from the class BarTable ------------------------");

        System.out.println(barTable2);

        System.out.println(barTable2.getTableTop());


        System.out.println("-------------------------Objects from the class BarTable ------------------------");



    }




}

