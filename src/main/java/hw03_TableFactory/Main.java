package hw03_TableFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        iTableFactory tableFactory = new TableFactory();
        UsualTable usualTable = tableFactory.createUsualTable();

        System.out.println(usualTable);

        BarTable barTable = tableFactory.createBarTable();

        System.out.println(barTable);


        System.out.println("usualTable TableTop: " + usualTable.getTableTop());
        System.out.println("barTable TableTop: " + barTable.getTableTop());






    }




}

