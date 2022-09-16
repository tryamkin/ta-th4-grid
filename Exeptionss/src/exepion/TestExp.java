package exepion;

public class TestExp extends RuntimeException {
    public TestExp(int t) {
        this.t = t;
    }

    public TestExp(String message, int t) {
        super(message);
        this.t = t;
    }

    public TestExp(String message, Throwable cause, int t) {
        super(message, cause);
        this.t = t;
    }

    public TestExp(Throwable cause, int t) {
        super(cause);
        this.t = t;
    }

    public TestExp(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int t) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.t = t;
    }

    public TestExp(String test_broken) {
        super();
        System.out.println(test_broken);
    }
    int t = 1;
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    //   TestExp testExp = new TestExp("y");


    @Override
    public void setStackTrace(StackTraceElement[] stackTrace) {
        super.setStackTrace(stackTrace);
    }

    public void setStackTrace(int y) {
        System.out.println(y);
    }

    public void getMessage(String get) {
    }
}
