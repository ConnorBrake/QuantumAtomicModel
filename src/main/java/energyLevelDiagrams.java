import java.util.ArrayList;
/**
 *
 * @author Connor Brake
 */
public class energyLevelDiagrams {
    
    //Total Electrons Variable
    private int totalElectrons;
    //A String Representation of the Aufbau Diagram 
    private final String map = "1s2s2p3s3p4s3d4p5s4d5p6s4f5d6p7s5f6d7p6f7d7f";
    //The Name of the Element Variable
    private String elementName;
    //The Array List Variable
    private ArrayList<String> orbitals;
    
    //Creates an Energy Level Diagram
    public energyLevelDiagrams(String elementName, int totalElectrons)
    {
        //The Name of the Element
        this.elementName = elementName;
        //The Total Number of Electrons of the Element
        this.totalElectrons = totalElectrons;
        //An Array List that will Contain all the Orbital Information
        orbitals = new ArrayList<String>();
        
        //Fills the Orbitals
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
          //displayElectronConfigurationDiagram();
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
    
    //Displays an Electron Configuration Diagram (Only the Last Electrons are Shown and No Shorthand has been Implemented)
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
