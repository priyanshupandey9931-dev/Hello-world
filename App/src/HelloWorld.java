class HelloApp {
    public void display(String[] args) {
        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) {
        HelloApp obj = new HelloApp();
        obj.display(args);
    }
}