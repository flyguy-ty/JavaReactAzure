package cookies;

public class CookieArrayList {
    //    pseudocode

//    variables needed:
//    Array of something;
    String comedians[] = {"Joe Rogan", "Louis C.K.", "Chris Rock", "Jerry Seinfeld"};
//    The current amount of somethings;
   int amount = comedians.length;

//    Constructor that creates an initial array of some size;
    CookieArrayList(){
    }

    int i = 0;
//    Get method that returns the something of a given index;
    String getElement(int i){
        return comedians[i];
    }
//    Add method
    public void addElement(){

    }
//    First, check that the arraylist will not break if we try to add at the next index:
//    IE, check if the current amount of somethings+1 is not greater that the array size
//    if it is greater:
//          Copy the elements of the current array to a new array.
//          set the pointer of the arrayList's internal array to the new array.
//    that adds things at an index that is currently unused
//    (this will be the current size)




//    a method that can return a boolean determining if your array list contains a certain item
//    (if you had an arraylist of objects, as opposed to primitives, you may need to implement and use .equals)
//    a method that can determine if your arraylist is identical to another one
//    (again, .equals)
//    a method that sets a given index to a particular value





}