public class Tester {
    public class Throwable {
        private String msg;

        public Throwable() { msg = null; }
        public Throwable(String message) { msg = message; }
        public String getMessage() { return msg; }
        public void printStackTrace() { }
    }
}