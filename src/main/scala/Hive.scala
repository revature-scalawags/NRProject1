import java.sql._

object Hive {

    /**
      * Method for answering question 1 as described in README.md
      * 
      * Prints out the list of agencies and the number of flights registered in their name.
      */
    def question1 = {
        var con: Connection = null
        try {
            println("Here is the list of Government Agencies and how many flights they have under their name:\n")
            val connectionString = "jdbc:hive2://localhost:10000/project1"
            Class.forName("org.apache.hive.jdbc.HiveDriver")
            con = DriverManager.getConnection(connectionString, "", "")

            val statement = con.createStatement()

            var resultSet1 = statement.executeQuery("select agency as a, count(*) as c from feds1 group by agency sort by c desc")
            //var resultSet2 = statement.executeQuery("select count(*) from feds2")
            //var resultSet3 = statement.executeQuery("select count(*) from feds3")
            
            while (resultSet1.next()) {
                val agency = resultSet1.getString("a")
                val count = resultSet1.getString("c")
                println(agency + " " + count)
            }
            println("\nQuery complete. Enter a new command.\n")
            println("1: Retrieves answer to Question 1.")
            println("2: Retrieves answer to Question 2.")
            println("3: Retrieves answer to Question 3.")
            println("q: Exits the program.")
        } catch {
            case e: Exception => e.printStackTrace()
        }
        con.close()
    }

    /**
      * Method for answering question 2 as described in README.md
      * 
      * Prints out the average latitude and longitude of surveilance
      */
    def question2 = {
        var con: Connection = null
        try {
            val connectionString = "jdbc:hive2://localhost:10000/project1"
            Class.forName("org.apache.hive.jdbc.HiveDriver")
            con = DriverManager.getConnection(connectionString, "", "")

            val statement = con.createStatement()
            var resultSet1 = statement.executeQuery("select AVG(latitude) as avgLat, AVG(longitude) as avgLon from feds1")
            //var resultSet2 = statement.executeQuery("select AVG(altitude) from feds2")
            //var resultSet3 = statement.executeQuery("select AVG(altitude) from feds3")

            while (resultSet1.next()) {
                val avgLat = resultSet1.getString("avgLat")
                val avgLon = resultSet1.getString("avgLon")

                println("Lat: "+ avgLat + " Long: " + avgLon)
            }
            
         } catch {
            case e: Exception => e.printStackTrace()
        }
        con.close()
    }

    /**
      * Method for answering question 3 as described in README.md
      * 
      * Prints out a list of aircraft types and the number of times they appear.
      */
    def question3 = {
        var con: Connection = null
        try {
            println("First, here is a key for understanding the first column.")
            println("4: Fixed-wing single-engine\n5: Fixed-wing multi-engine\n6: Helicopter\n2: Misc. or unidentified\n")
            println("Here is a list of aircraft types and the number of times they appear.\n")
            val connectionString = "jdbc:hive2://localhost:10000/project1"
            Class.forName("org.apache.hive.jdbc.HiveDriver")
            con = DriverManager.getConnection(connectionString, "", "")

            val statement = con.createStatement()
            var resultSet1 = statement.executeQuery("select type_aircraft as t, count(*) as c from feds1 group by type_aircraft sort by c desc")
            //var resultSet2 = statement.executeQuery("select AVG(altitude) from feds2")
            //var resultSet3 = statement.executeQuery("select AVG(altitude) from feds3")

            while (resultSet1.next()) {
                val airType = resultSet1.getString("t")
                val count = resultSet1.getString("c")
                println(airType + " " + count)
            }
            
         } catch {
            case e: Exception => e.printStackTrace()
        }
        con.close()
    }


}