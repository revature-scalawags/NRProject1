import com.typesafe.scalalogging.LazyLogging
import scala.io.StdIn.readLine

object Utilities extends LazyLogging {
    /**
      * Start the program and start taking input from user.
      */
    def Start = {

        logger.info("Program Started.")
        println("\nWelcome to Nick's Project 1!")
        println("Please choose from the following.\n")
        println("1: Retrieves answer to Question 1.")
        println("2: Retrieves answer to Question 2.")
        println("3: Retrieves answer to Question 3.")
        println("q: Exits the program.")

        var userInput = ""

        while (userInput != "q") {
            userInput = readLine()
            logger.info("User input recieved as: " + userInput)

            userInput match {
                case "1" => println("Querying Hive...\n"); Hive.question1
                case "2" => println("Querying Hive...\n"); Hive.question2
                case "3" => println("Querying Hive...\n"); Hive.question3
                case "q" => println("Exiting Program...")
                case _ => println("Input not valid. Please try again.")
            }
        }




    }
}