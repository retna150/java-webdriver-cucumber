package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class JavaStepDefs {
    @Given("I write first java step")
    public void iWriteFirstJavaStep() {
        System.out.println("Hello world");
        String firstName = "Retna";
        String lastName = "Ravi";
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(firstName + " " + lastName);
    }

    @And("I print {string} in console")
    public void iPrintInConsole(String txt) {
        System.out.println(txt);
        System.out.println(txt.toLowerCase());
        System.out.println(txt.length());
        System.out.println(txt.toUpperCase());
    }

    @And("I compare {string} and {string}")
    public void iCompareAnd(String arg0, String arg1) {
        if (arg0.equalsIgnoreCase(arg1)) {
            System.out.println("Strings are equal: " + arg0 + "and" + arg1);
        } else {
            System.out.println("Strings are not equal");
        }
    }

    @And("I do action with {string} and {string}")
    public void iDoActionWithAnd(String arg0, String arg1) {
        System.out.println("First variable value is " + arg0);
        System.out.println("Second value is: " + arg1);
        System.out.println("Is orange equal to orange? " + arg0.equals(arg1));
    }


    @Given("I perform actions with {string} and {string}")
    public void iPerformActionsWithAnd(String arg0, String arg1) {
        System.out.println("First variable is " + arg0);
        System.out.println("Second variable is " + arg1);
        System.out.println(arg0.toUpperCase());
        System.out.println(arg1.toUpperCase());
        System.out.println(arg0.length());
        System.out.println(arg1.length());
        System.out.println("Is my var is equal to my VAR? " + arg0.equals(arg1));
        System.out.println("Is my var is equal to my VAR? " + arg0.equalsIgnoreCase(arg1));
        System.out.println("partial comparison between my var and my VAR " + arg0.contains(arg1));
    }

    @Given("I run operators with {int} and {int}")
    public void iRunOperatorsWithAnd(int num1, int num2) {
        System.out.println("Division:" + num1 / num2);
        System.out.println("sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        {

            if (num1 < num2) {
                System.out.println("num1 is less than num2");
            } else {
                System.out.println("num1 is greater than num2");
            }
        }


    }

    @Given("I print arrays")
    public void iPrintArrays() {
        String[] groceryList = {"lemon", "pear", "milk", "fish", "mint"};
        System.out.println(groceryList);// not going to work,need to use index
        for (int i = 0; i < groceryList.length; i++) {
            System.out.println(groceryList[i]);
        }
        System.out.println("For loop");
        for (String elem:groceryList){
            System.out.println(elem);
        }


    }

    @And("I print numeric array")
    public void iPrintNumericArray() {
        //Create an array
        int[]numbers={0,1,2,3,4,5,6,7,8,9};
        System.out.println(numbers[6]);
        for (int nums:numbers){
            System.out.println(nums);

        }
        System.out.println("Print array using For Loop");
        for (int i=0;i<numbers.length;i++)
            System.out.println(numbers[i]);

    }
}









