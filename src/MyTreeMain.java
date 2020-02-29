public class MyTreeMain {
    public static void main(String[] args) {
        Mytree obj = new Mytree();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        obj.traversal();
        obj.destroy();
      //  obj.traversal();

    }
}
