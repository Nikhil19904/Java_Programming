
// package Basics;

public class Test {

    private class Test3 {
        // inner class m private allowed hota hai
        // inner class m nested private bhi ho skte h
    }

}

// private class Test1 {
// // these gives the error - modifier private not allowed here
// }

class Test2 {

}

// this gives the error bcz the top-level class is not private &
// protected.....it is only public or default

// "Private and protected modifiers are not allowed for top-level classes in
// Java; they are only applicable
// to members like methods, variables, or inner classes."

// note : in java we can declare the many classes in a source program file but
// it is not recommended by the programmers
// bcz it downgrade the readabilty of the program....so bcz of this we
// recommanded that we can only one class on per source
// program file