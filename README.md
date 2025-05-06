Energy Level Diagram Generator

This Java program simulates the Aufbau Principle to generate the electron configuration and energy level diagrams for a given chemical element based on its number of electrons.

Features
Calculates the energy level diagram of an atom using the Aufbau filling order.

Differentiates between electron spin states (up and down).

Supports s, p, d, and f orbitals with appropriate electron capacities.

Stores orbital and spin data in an ArrayList.

Usage
Class: energyLevelDiagrams
Constructor
java
Copy
Edit
energyLevelDiagrams(String elementName, int totalElectrons)
Parameters:

elementName – the name of the element (e.g., "Oxygen").

totalElectrons – total number of electrons in the element.

This constructor fills the orbitals according to the Aufbau principle and stores the configuration internally.

It fills electrons into orbitals based on their type (s, p, d, or f) and the number of electrons allowed in each orbital:

s: 2 electrons

p: 6 electrons

d: 10 electrons

f: 14 electrons


Optional Display Methods
Uncomment the following lines in the constructor to see visual output.

Notes
The class currently does not include a main method. To run the program, create a driver class and instantiate the energyLevelDiagrams object.

Spin-up electrons are added first, followed by spin-down electrons, according to Hund's Rule.

Example:

public class Main {
    public static void main(String[] args) {
        energyLevelDiagrams oxygen = new energyLevelDiagrams("Oxygen", 8);
    }
}
