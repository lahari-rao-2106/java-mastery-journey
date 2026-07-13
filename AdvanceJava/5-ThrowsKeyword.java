/*
The throws keyword is used in a method declaration to declare the 
exceptions that may occur during the execution of the method. 
It passes the responsibility of handling those exceptions to the calling method.


D.readFile()
      │
      │ throws IOException
      ▼
C.execute()
      │
      │ throws IOException
      ▼
Main.main()
      │
      │ try-catch
      ▼
IOException Handled

E.connectDatabase()
      │
      │ throws SQLException
      ▼
C.execute()
      │
      │ throws SQLException
      ▼
Main.main()
      │
      │ try-catch
      ▼
SQLException Handled
*/

import java.io.*;
import java.sql.*;

class D {

    void readFile() throws IOException {

        FileReader file = new FileReader("data.txt");
        System.out.println("File opened successfully.");

    }
}

class E {

    void connectDatabase() throws SQLException {

        throw new SQLException("Database connection failed.");

    }
}

class C {

    D d = new D();
    E e = new E();

    void execute() throws IOException, SQLException {

        d.readFile();          // Exception may occur here
        e.connectDatabase();   // Exception may occur here

    }
}
class Main {

    public static void main(String[] args) {

        C c = new C();

        try {

            c.execute();

        }
        catch (IOException e) {

            System.out.println("IOException Handled");
            System.out.println(e);

        }
        catch (SQLException e) {

            System.out.println("SQLException Handled");
            System.out.println(e);

        }

        System.out.println("Program Continues...");
    }
}