public class ExceptionHandelling {

    public static void main(String[] args) {

        try {
            String welcomeMessage = welcomeMessage("Ravish");
            System.out.println("The returned welcome message : " + welcomeMessage);
        } catch (NullPointerException npex) {
            System.out.println("Exception handled : "
                    + npex.toString());
        } finally {
            System.out.println("Finally I will be Executed");
        }
        try {
            String welcomeMessage = welcomeMessage(null);
            System.out.println("The returned welcome message : " + welcomeMessage);
        } catch (NullPointerException npex) {
            System.out.println("Exception handled : " + npex.toString());
        } finally {
            System.out.println("Finally I will be executed");
        }
    }

    public static String welcomeMessage(String name)
            throws NullPointerException {

        if (name == null) {

            throw new NullPointerException("Invoked with invalid name");
        }

        String welcomeMsg = "Welcome " + name;

        return welcomeMsg;
    }
}