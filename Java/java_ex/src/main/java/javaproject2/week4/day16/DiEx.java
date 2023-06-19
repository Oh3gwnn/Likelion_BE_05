package javaproject2.week4.day16;

public class DiEx {
    private ParallelogramShapeDrawer parallelogramShapeDrawer;

    public DiEx(ParallelogramShapeDrawer parallelogramShapeDrawer) {
        this.parallelogramShapeDrawer = parallelogramShapeDrawer;
    }

    public void doSth() {
        parallelogramShapeDrawer.printShape(5);
    }
}
