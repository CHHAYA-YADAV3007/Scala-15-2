/**
 * ScalaMapDemo.scala
 * Compiled on 12th Nov 2017
 * @author Chhaya Yadav
 */
//public package declaration

package scalaAssign52package

//importing the package to use mutable MAP from Scala Collections

import scala.collection.mutable.Map ;

//importing the package in order to take user input at runtime

import java.util.Scanner ;

/**
 * This Scala Program will print the prices of Courses that Acadgild offers using pattern match 
 * and add a default condition if the user enters any other course unavailable at Acadgild.
 * 
 */
//Scala Object declaration and definition

object ScalaMapDemo {

//method declaration in order to determine the price of course which is fetched from SCALA MAP. 
  
  def patternMatch( course :String ) : Unit = {
  
//SCALA MAP declaration
    
    var acadgildMap = Map[ String , Int ]();
    
//Scala Map Initialization    
    
    acadgildMap += ("Android" -> 12999);
    
    acadgildMap += ("Big Data Development" -> 17999);
    
    acadgildMap += ("Big Data Development" -> 17999);
    
    acadgildMap += ("Spark"-> 19999);
    
//Pattern matching for course (key) of Map
    
//Additionally course has been made case insensitive for user convenience.    
    
    course match {
    
    case course if (course == "Android" || course == "android" ||course == "ANDROID" ) 
       
        => println("Android Course Price : " +acadgildMap("Android"))
    
    case course if (course == "Big Data Development" || course == "big data development" 
                                                     || course == "BIG DATA DEVELOPMENT")

        => println("Big Data Development Price : "+acadgildMap("Big Data Development"))
     
    case course if (course == "Spark" || course == "spark" || course == "SPARK" ) 
        
        => println("Spark Price : "+acadgildMap("Spark"))
      
    case _ 
       
        => println(course + " Course is not available right now at Acadgild.We will look forward to this course in future.")
    
    }
    
    
  }
  
//Main method declaration
  
  def main(abc:Array[String]):Unit ={
    
        println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
        
    println("~~~~~~~~~~~PATTERN MATCHING DEMO WITH MAP in SCALA~~~~~~~~~~~")
        
//invocation of user defined Scala Method and passing argument statically
        
    patternMatch("Android")
    
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    
    patternMatch("android")
        
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    
    patternMatch("ANDROID")
    
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    
    println("Please enter the  course for querying the price at ACADGILD ")
        
//Invoke the method and pass the course(key) at runtime        
    
    patternMatch(readLine())
    
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    
    
   
   
}}