import java.sql._

object test {
     def test = {
        var con: Connection = null
        try {
            val connectionString = "jdbc:hive2://localhost:10000/project1"
            Class.forName("org.apache.hive.jdbc.HiveDriver")
            con = DriverManager.getConnection(connectionString, "", "")

            val statement = con.createStatement()
            var resultSet = statement.executeQuery("select * from feds1 where altitude between 500 and 1000")

            //resultSet.next actually primes the first result. (Starts at -1 index)
            while (resultSet.next()) {
                val foo = resultSet.getString("adshex")
                val bar = resultSet.getString("altitude")
                println(foo + " " + bar)
            }
        } catch {
            case e: Exception =>  e.printStackTrace()
        }
    con.close()
    }
}