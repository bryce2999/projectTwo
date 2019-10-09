
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Lab 7
 * 
 * Class to simulate a restaurant comparison system. A user is able to place ticket orders at a restaurant and
 * give completion times. A user can also check to see what the next ticket to be completed is. The system by
 * which the restaurant determines which ticket to complete next is dependent on the implementation (i.e. which
 * subclass of Restaurant it is).
 * 
 * @author Stephen
 * @version 2018-10-09
 * 
 * @modified by Em Evans
 * @version 2019-09-30
 */

public class Driver {
    /**
     * Main method for the Restaurant Comparison system.
     * 
     * @param args command-line arguments [not used]
     */
	public static void main(String[] args)
    {
        // Set up the restaurants to compare:
        StackRestaurant stack = new StackRestaurant();
        QueueRestaurant queue = new QueueRestaurant(4);
        
        // Set up the user input loop:
        boolean done = false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(!done)
        {
            System.out.println("Please choose a restaurant option:");
            System.out.println("\t1. [enter] an order.");
            System.out.println("\t2. [complete] a order.");
            System.out.println("\t3. [check] the next order to be completed.");
            System.out.println("\t4. [quit]");
            
            try
            {
                String input = reader.readLine();
                if (input.equalsIgnoreCase("quit"))
                {
                    done = true;
                }
                else if (input.equalsIgnoreCase("enter"))
                {
                    System.out.println("Please enter an order description, an order time"
                            + " with the following format:");
                    System.out.println("<description>,<time as an int>");
                    String[] entry = reader.readLine().split(",");
                    // Verify that entry matches expected format:
                    if (entry.length != 2)
                    {
                        System.out.println("Please enter an appropriate order!");
                    }
                    else
                    {
                        System.out.println(queue.addOrder(new Order(entry[0], Integer.parseInt(entry[1]))) ?
                                "Order added to QueueRestaurant" :
                                "Order could not be added to QueueRestaurant"
                        );

                        System.out.println(stack.addOrder
                        		(new Order(entry[0], Integer.parseInt(entry[1]))) ?
                                "Order added to StackRestaurant" :
                                "Order could not be added to StackRestaurant"
                        );
                    }
                }
                else if (input.equalsIgnoreCase("complete"))
                {
                    System.out.println("Please enter the time of completion as an int:");
                    // Verify that entry matches expected format:
                    int timeCompleted = Integer.parseInt(reader.readLine());
                    System.out.println("The completion for the stack restaurant:\n" + stack.completeOrder(timeCompleted) + "\n");
                    System.out.println("The completion for the queue restaurant:\n" + queue.completeOrder(timeCompleted) + "\n");
                }
                else if (input.equalsIgnoreCase("check"))
                {
                    System.out.println("For the stack restaurant: ");
                    System.out.println("Next Completed Order: " + stack.checkNextCompletedOrder());
                    System.out.println("Order Remaining: " + stack.numberRemainingOrder());
                    
                    System.out.println("For the queue restaurant: ");
                    System.out.println("Next Completed Order: " + queue.checkNextCompletedOrder());
                    System.out.println("Orders Remaining: " + queue.numberRemainingOrder());
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Input integer not formatted correctly.");
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}

