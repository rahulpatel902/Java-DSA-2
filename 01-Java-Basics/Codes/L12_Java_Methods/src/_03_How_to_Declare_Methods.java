public class _03_How_to_Declare_Methods {
    public static void main(String[] args) {
        /*
        * Method declaration provides information about the attributes, such as
        * visibility, return type, name, and arguments of the method. It mainly
        * consists of six components (in a method header), as shown in the
        * following figure.
        * */
        //Example:
        /*
           public int sum(int a, int b){
             //Methode Body
           }
         */

        /*-------------------
        * 1. Method Signature:
        * In Java, a method signature is a part of the method declaration.
        * It's a combination of the method name and parameter list.
        * ---------------------------------------------------------------
        * ---------------------------------------------------------------
        * 2. Access Specifier:
        * It is the access type of the method. It specifies the visibility
        * and accessibility of the method. You will have a clear idea once we
        * discuss it with a program. But before that, let us explore the available
        * options for access specifiers. In java,
        * there are four types of access specifiers:
        * -----------------------------------------
        * i) Private : The methods and/or data members declared as private are
        *             accessible only within the class where they are declared.
        * ii) Public : The methods that are declared public are accessible from
        *              everywhere in the program. There is no restriction on
        *              the scope of public data members.
        * iii) Protected : The methods declared as protected are accessible within
        *              the same package or subclasses in different packages.
        * iv) Default : When no access modifier is specified for a method – It is
        *               said to be having the default access  modifier by default.
        *      Default access modifiers are accessible only within the same package.
        * -------------------------------------------------------------------------
        * That was too much of information to process, isn’t it ? But what if we derive
        * analogies with something which we explore on a regular basis. How about social
        * media ?! Facebook ?That would make you learn the concept of
        * public, private, protected in a better way.
        * -------------------------------------------------------------------------------
        * Suppose, you plan to upload a Facebook Status. Have you ever noticed,
        *  you can do it in 4 possible ways:
        * ---------------------------------
        * (A). If you make your status visible for “Public”, anyone and everyone can
        * see this status all across the facebook. This draws a parallel with Public
        * Access Specifiers that we have just learnt.
        * -------------------------------------------------------------------------------
        * (B). If you make this status visible "only for me" the status will only be
        * visible in and from your account. This is similar to Private Access Specifiers.
        * -------------------------------------------------------------------------------
        * (C). If you make this status visible for “Friends or Friends of friends”, your
        * status will be only visible to your friends and your friend’s immediate friends
        * which means although many people can see the status now but still not everyone
        * present on Facebook will be able to view it. They at least need to have a common
        * connection between them and you. This is similar to the behaviour of
        * Protected Access Specifiers.
        * ---------------------------------------------------------------------------------
        * (D). If you make this status visible for "Friends", then your status will be only
        * visible to your immediate friends. It will not be visible to your friend’s friend
        * or everyone signed up on Facebook.This is similar to the working of
        * Default Access Specifiers.
        * ----------------------------------------------------------------------------------
        * ----------------------------------------------------------------------------------
        * 3.Return type : It is used to specify the data type of the value returned from
        * a method.
        * ----------------------------------------------------------------------------------
        * ----------------------------------------------------------------------------------
        * 4.Method Name : Every method has a name and is invoked/called by it. Name should
        * be given in such a way  that it corresponds to the functionality of the method.
        * Eg- add () method should have addition functionality.
        * ----------------------------------------------------------------------------------
        * ----------------------------------------------------------------------------------
        * 5.Parameters : Parameters act as normal variables inside the method. They are
        * specified after the method name, inside the parentheses. You may add as many
        * parameters as you want as per requirement, syntactically, you just have to
        * separate them with a comma.
        * ----------------------------------------------------------------------------------
        * ----------------------------------------------------------------------------------
        *6.Method Body: It contains all the actions to be performed i.e. the code for which
        * method has been made. It is enclosed within the pair of curly braces.
        * */




    }
}
