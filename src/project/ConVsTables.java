
package project;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ConVsTables {
      


public static void main(String[] args) {

     

   Connection conn = null;

   Statement stmt = null;

   String sql="";
   
   String unicode= "?useUnicode=yes&characterEncoding=UTF-8";

  

try{

   
            conn=ConnectionProvider.getCon();


     

stmt = conn.createStatement();

      //creating table
      
      sql = "CREATE TABLE if not exists  tj_section " +

                   "( id int primary key auto_increment not null, " +

                   " tj_teacher VARCHAR(200), " +
              
                   " students VARCHAR(200), " +

                   " tj_time VARCHAR(200), " +

                   " tj_topic VARCHAR(200), " +
              
                   " tj_reports VARCHAR(1000)) ";

//      sql = "CREATE TABLE if not exists  class_section " +
//
//                   "( id int primary key auto_increment not null, " +
//
//                   " class_teacher VARCHAR(200), " +
//              
//                   " students VARCHAR(200), " +
//
//                   " class_time VARCHAR(200), " +
//
//                   " class_book VARCHAR(200), " +
//              
//                   " class_reports VARCHAR(1000)) ";
 //     sql=("create table team_leader_registration(id int primary key auto_increment not null,team_leader_name varchar(200),team_leader_agents varchar(200),team_leader_managements_day varchar(200),team_leader_managements_time varchar(200),team_leader_manager_name varchar(200) ,team_leader_responsibility varchar(200),team_leader_registration_day varchar(200),status varchar(20)) "); 
   
 //   sql=("create table team_leader_report1(id int ,team_leader_name varchar(200),team_leader_agents varchar(200),team_leader_agents_reality varchar(500),team_leader_plan_for_manager varchar(1000)) "); 

    //sql=("create table team_leader_report2(id int ,team_leader_name varchar(200),team_leader_responsibility varchar(500),team_leader_responsibility_reality  varchar(1000),team_leader_ghamkhori varchar(1000)) ");
     
   //    sql=("create table team_leader_report3(id int ,team_leader_name varchar(200),persons_ready_interduction varchar(1000),persons_ready_class varchar(1000)) ");

         //   sql=("create table team_leader_report4(id int ,team_leader_name varchar(200),team_leader_sadaqat varchar(500),team_leader_plans varchar(1000)) ");

 


      stmt.executeUpdate(sql);

      JOptionPane.showMessageDialog(null,"Table Created Successfuly");



     

      //STEP 6: Clean-up environment

     

      stmt.close();

      conn.close();

   }catch(SQLException se){
       //Handle errors for JDBC

   }catch(Exception e){
       //Handle errors for Class.forName

   }finally{

      //finally block used to close resources

      try{

         if(stmt!=null)

            stmt.close();

      }catch(SQLException se2){

      }// nothing we can do

      try{

         if(conn!=null)

            conn.close();

      }catch(SQLException se){
      }//end finally try

   }//end try


}//end main
}//end

    

