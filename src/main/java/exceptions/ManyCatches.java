package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ManyCatches {
  public static void main(String[] args) {
    try {
      if (Math.random() > 0.7) throw new SQLException();
      if (Math.random() > 0.7) throw new FileNotFoundException();
      if (Math.random() > 0.7) throw new IOException();
      throw new RuntimeException();
    } catch (IOException | SQLException e) { // Multi-catch
      System.out.println("Got an expected problem " + e);
    }

//    } catch (Exception e) {
//      System.out.println("Got an exception: " + e);
//    }


//    } catch (SQLException throwables) {
//      throwables.printStackTrace();
////    } catch (FileNotFoundException e) {
////      e.printStackTrace();
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
  }
}
