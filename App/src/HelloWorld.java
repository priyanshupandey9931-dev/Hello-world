class HelloApp {

    public void display(String[] args) {
        if (args.length > 0) {
            String result = "Hello " + String.join(", ", args);
            System.out.println(result);
        } else {
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) {
        HelloApp obj = new HelloApp();
        obj.display(args);
    }
}