class HelloApp {

    public void display(String[] args) {
        if (args.length > 0) {
            String result = "Hello ";

            // Build string with trailing comma
            for (String name : args) {
                result += name + ", ";
            }

            // Remove last ", " using substring
            result = result.substring(0, result.length() - 2);

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