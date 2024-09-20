//Alexis West
//September 20, 2024
//Lab 9
//This program will ask the user for the number of 512 byte blocks available for storage and then compress the file 
//by 512 bytes and return the number of blocks occupied until there is no more left.

import java.util.Scanner;

public class CompressFiles {
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many 512-byte blocks are available on the storage device?");
        int availableBlocks = keyboard.nextInt();
        
        while(availableBlocks > 0)
        {
            System.out.println("How big is the file in bytes?");
            int currentFile = keyboard.nextInt();

            //compress file * .8
            currentFile = (int)Math.round(currentFile * 0.8);

            //divide file by 512 bytes to get how many blocks
            //round up for blocks !important
            int necessaryBlocks = (int)Math.ceil(currentFile / 512.0);
            System.out.println(necessaryBlocks);

            //edge case for if it exactly fits;use >=
            if((availableBlocks - necessaryBlocks) >= 0)
            {
                availableBlocks -= necessaryBlocks;
    
                //return the compressed file and blocks needed 
                System.out.println("The file will be compressed to " + currentFile + " bytes. That will take " + necessaryBlocks + " blocks. You have " + availableBlocks + " blocks available." );
            
            } 
            else 
            //return you don't have enough blocks
            {
                System.out.println("The file will be compressed to " + currentFile + " bytes. That will take " + necessaryBlocks + " blocks. You have only " + availableBlocks + " blocks. The file cannot be compressed and stored." );
                //quit
                break;
            }
        }
        keyboard.close();
    }
}

/*
 public class CompressFiles {
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many 512-byte blocks are available on the storage device?");
        int availableBlocks = keyboard.nextInt();

        System.out.println("How big is the file in bytes?");
        int currentFile = keyboard.nextInt();
        
        while(currentFile > 512)
        {
            //compress file * .8
            currentFile = (int)Math.round(currentFile * 0.8);

            //divide file by 512 bytes to get how many blocks
            //round up for blocks !important
            int necessaryBlocks = Math.round(currentFile / 512);

            availableBlocks -= necessaryBlocks;

            //return the compressed file and blocks needed 
            System.out.println("The file will be compressed to " + currentFile + " bytes. That will take " + necessaryBlocks + " blocks. You have " + availableBlocks + " available." );
        
            System.out.println("How big is the file in bytes?");
            currentFile = keyboard.nextInt();
        }
        
    }
}
 */
