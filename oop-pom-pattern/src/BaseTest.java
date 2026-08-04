public abstract class BaseTest {
    public void setUp(){
        System.out.println("setUp Trình Duyệt");
        System.out.println("Mở trình duyệt");
        System.out.println("Confic trình duyệt");
    }

    public void tearDown(){
        System.out.println("Teardown trinh duyệt");
    }


    public abstract void runTest();
}
