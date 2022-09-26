public class CompositeMain {
    public static void main(String[] args) {

        Component hd=new Leaf(4000, "HDD");
        Component mouse=new Leaf(300, "Mouse");
        Component monitor=new Leaf(7000, "Monitor");
        Component ram=new Leaf(2500, "Ram");
        Component cpu=new Leaf(9000, "CPU");

        Composite ph=new Composite("Peripheral");
        Composite cabinet=new Composite("Cabinet");
        Composite motherBoard=new Composite("Mother Board");
        Composite computer=new Composite("Computer");

        motherBoard.addComponent(cpu);
        motherBoard.addComponent(ram);

        ph.addComponent(mouse);
        ph.addComponent(monitor);
        cabinet.addComponent(hd);
        cabinet.addComponent(motherBoard);

        computer.addComponent(ph);
        computer.addComponent(cabinet);

        cabinet.showprice();

    }
}
