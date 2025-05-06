/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author 1337
 */
public class energyLevelDiagrams {
    
    private int totalElectrons;
    private final String map = "1s2s2p3s3p4s3d4p5s4d5p6s4f5d6p7s5f6d7p6f7d7f";
    private String elementName;
    private ArrayList<String> orbitals;
    
    public energyLevelDiagrams(String elementName, int totalElectrons)
    {
        this.elementName = elementName;
        this.totalElectrons = totalElectrons;
        orbitals = new ArrayList<String>();
        
        for(int i = 0; totalElectrons * 2 > 0; i+=2)
        {
            //If Filling an S Orbital is Required
            if(map.substring(i+1, i+2).equals("s"))
            {
                int sizeOfList = orbitals.size() - 1;
                this.orbitals.add(map.substring(i, i+2));
                //Places the Clockwise (Up Spinning) Electrons in Their "Spots" First
                for(int up = 0; up < 1; up++)
                {
                    if(totalElectrons > 0)
                    {
                        this.orbitals.add("up");
                        totalElectrons--;
                    }
                }
                //Places the Counter-Clockwise (Down Spinning) Electrons in Their "Spots" Secondly
                for(int down = 0; down < 2; down += 2)
                {
                    if(totalElectrons > 0)
                    {
                        this.orbitals.add(sizeOfList + down + 3, "down");
                        totalElectrons--;
                    }
                }
            }
            
            //If Filling a P Orbital is Required
            else if(map.substring(i+1, i+2).equals("p"))
            {
                int sizeOfList = orbitals.size() - 1;
                this.orbitals.add(map.substring(i, i+2));
                //Places the Clockwise (Up Spinning) Electrons in Their "Spots" First
                for(int up = 0; up < 3; up++)
                {
                    if(totalElectrons > 0)
                    {
                        this.orbitals.add("up");
                        totalElectrons--;
                    }
                }
                //Places the Counter-Clockwise (Down Spinning) Electrons in Their "Spots" Secondly
                for(int down = 0; down < 6; down += 2)
                {
                    if(totalElectrons > 0)
                    {
                        this.orbitals.add(sizeOfList + down + 3, "down");
                        totalElectrons--;
                    }
                }
            }
            
            //If Filling a D Orbital is Required
            else if(map.substring(i+1, i+2).equals("d"))
            {
                int sizeOfList = orbitals.size() - 1;
                this.orbitals.add(map.substring(i, i+2));
                //Places the Clockwise (Up Spinning) Electrons in Their "Spots" First
                for(int up = 0; up < 5; up++)
                {
                    if(totalElectrons > 0)
                    {
                        this.orbitals.add("up");
                        totalElectrons--;
                    }
                }
                //Places the Counter-Clockwise (Down Spinning) Electrons in Their "Spots" Secondly
                for(int down = 0; down < 10; down += 2)
                {
                    if(totalElectrons > 0)
                    {
                        this.orbitals.add(sizeOfList + down + 3, "down");
                        totalElectrons--;
                    }
                }
            }
            
            //If Filling an F Orbital is Required
            else
            {
                int sizeOfList = orbitals.size() - 1;
                this.orbitals.add(map.substring(i, i+2));
                //Places the Clockwise (Up Spinning) Electrons in Their "Spots" First
                for(int up = 0; up < 7; up++)
                {
                    if(totalElectrons > 0)
                    {
                        this.orbitals.add("up");
                        totalElectrons--;
                    }
                }
                //Places the Counter-Clockwise (Down Spinning) Electrons in Their "Spots" Secondly
                for(int down = 0; down < 14; down += 2)
                {
                    if(totalElectrons > 0)
                    {
                        this.orbitals.add(sizeOfList + down + 3, "down");
                        totalElectrons--;
                    }
                }
            }
        }
          //displayEnergyLevelDiagram();
          displayElectronConfigurationDiagram();
    }
    
    //Displays an Energy Level Diagram
    private void displayEnergyLevelDiagram()
    {
        String temp = "";
        System.out.print(this.elementName);
        for(int i = 0; i < orbitals.size(); i++)
        {
            if(orbitals.get(i).equals("up") || orbitals.get(i).equals("down") && i != 0)
            {
                temp += orbitals.get(i) + " ";
            }
            else
            {
                System.out.println(temp);
                temp = orbitals.get(i) + " - ";
            }
        }
        System.out.println(temp);
    }
    
    //Displays an Electron Configuration Diagram (Only the Last Electrons are Shown)
    private void displayElectronConfigurationDiagram()
    {
        String temp = "";
        int count = 0;
        for(int i = 0; i < orbitals.size(); i++)
        {
            if(!orbitals.get(i).equals("up") && !orbitals.get(i).equals("down"))
            {
                temp += orbitals.get(i);
                count = 0;
            }
            else
            {
                count++;
            }
        }
        
        System.out.println(this.elementName + "\n" + temp + count);
    }
}
