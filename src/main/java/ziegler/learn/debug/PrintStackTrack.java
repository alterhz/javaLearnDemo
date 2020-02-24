package ziegler.learn.debug;

public class PrintStackTrack {


    public static void main(String[] args) {
        PrintStackTrack t = new PrintStackTrack();

        t.test();
    }

    void test() {
        RunTest runTest = new RunTest();
        runTest.printTrackTest();
    }

}
