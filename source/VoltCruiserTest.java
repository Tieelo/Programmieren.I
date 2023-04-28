public class VoltCruiserTest {
    public static void main (String[] args){
        VoltCruiser VoltCruiser1 = new VoltCruiser("DE3841", 35);
        VoltCruiser VoltCruiser2 = new VoltCruiser("DE4851m", 24);

        VoltCruiser1.laden();
        VoltCruiser1.drive();

    }
}
