/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solid.DIP;

/**
 *
 * @author Uniminuto Tibu
 */
public class Good {
    interface Database{
        void connect();
    }
    class MySQLDatabase implements Database{
        public void connect(){
            System.out.println("conectando a MySQL...");
        }
    }
    class PostgreSQLDatabase implements Database{
        public void connect(){
            System.out.println("conectando a progreSQL...");
        }
    }
    class DataManager {
        private Database database = new PostgreSQLDatabase();
        
        public DataManager(Database database){
            this.database = database;
        }
        public void connect(){
            database.connect();
        }
    }
}
