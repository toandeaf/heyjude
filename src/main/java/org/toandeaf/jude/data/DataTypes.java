package org.toandeaf.jude.data;

// For this part, don't worry about what anything means except from lines 8 to line
// Everything else will be covered down the line.
public class DataTypes
{
    public static void main(String [] args)
    {
        // We're going to start with programming at the most basic level: data.
        // e.g. how is data defined, how is it structured and how does it behave.

        // Java, like a lot if not most programming languages, defines data in two different bundles.
        // The first bundle of data types are referred to as "primitives". They are keywords/reserved words within
        // the Java language and are essentially "raw" data: numbers, characters, booleans (true/false flags) and
        // bytes. There are and will likely only ever be 8 of them.

        // int, double, short, long, float, boolean, char, byte

        // int
        // Basically your go to "number" data type. Can have a maximum value of 2147483647, so if you think your number
        // will be smaller than that, use this.

        // double
        // Number. How we handle decimal places and non-whole numbers in Java.

        // short
        // Number. Smaller maximum size than integer, significantly so (32,767).
        // More efficient memory wise to use, but you'll generally rarely see it used, stick to integer.

        // long
        // Number. If your number is due to be really big, max value is 9,223,372,036,854,775,807.
        // If your number looks like it COULD be longer than max int, use long.

        // float
        // Number. Absolutely huge max value WITH decimal points following too. Rarely see in day to day programming.
        // Max value 340,282,346,638,528,860,000,000,000,000,000,000,000.000000.

        // boolean
        // Basically a true or false flag. It can only be one of those two values: true or false.

        // char
        // Short for "character". Contains a SINGLE character, basically anything you can find on your keyboard.
        // Described by wrapping your target character in ' '
        // e.g. 'J'
        // NOTE -- Do note confuse this with a "string", that will be discussed later.

        // byte
        // Number, sort of. Basically a tiny, tiny number. Between -127 and 127. You'll only every really see as part
        // of an array. Ignore this one for now, may become relevant later.

        // Now to CREATE/USE any of these data types so we can use them in our programming, we have to DECLARE them.
        // In order to do this, we require FOUR components:
        // (The Data Type) + (The Variable Name) + (The Assignment Operator) + (The Value).

        /*
         (The Data Type)
         */
        // Java is a "strongly-typed" language, meaning that when we want to declare a value we need to specifically
        // tell Java what "type" of value we're wanting. e.g. int, double etc.

        /*
         (The Variable Name)
         */
        // This can be any word/combination of letters (try to avoid numbers and some special characters will break it)
        // and will be used to describe and refer to your stored value.
        // NOTE -- While it might seem easier to just name your variables something short or random for convenience when
        // working in short programs, build the habit of good variable naming early, as it becomes incredibly important
        // for clean readable code as your codebase grows.

        // e.g. if you're declaring a variable to store your granny's age refer to the variable as something like:
        // int grannysAge = 80;
        // NOTE -- Java follows a 'camel-case' string formatting, meaning that if we're declaring a variable/method name
        // that consists of more than one word: keep the first letter lowercase and then the beginning of the next word(s)
        // as upper case
        // e.g. jakeToan, theManPlaysWithJava etc.

        /*
         (The Assignment Operator)
         */
        // In order to assign a VALUE to our VARIABLE (value store) we need to use an assignment operator.
        // In most cases, we simple use an '='.
        // NOTE -- Do not confuse this with the equivalency operator '==', what this does is:
        // valueA == valueB
        // Which equates to: "Value A is equal to Value B"

        /*
         (The Value)
         */
        // This is the actual value that we're wanting to store in the variable. It MUST match the DATA TYPE of the variable
        // we have just declared in the first part of our declaration.

        // What we can do for example:
        // int age = 18;
        // char myInitial = 'J';

        // What we can't do:
        // int age = '8';
        // char grannysAge = 80;

        // While both of the can't dos may LOOK fine, their values do not match their data types.
        // Even if the content is numeric within these ' ' quote marks, the quote marks denote the value type as char.
        // Even though the variable name suggests a number, its type is char and expects the appropriate formatting to
        // render it as one.

        // Below we'll declare a variable with all of our primitive data types.
        // NOTE -- You can see that all declarations end with ";" This is consistent in Java and lets the compiler
        // know when the statement is finished. This is required.

        short shortNumber = 200;
        int intNumber = 3000;
        long longNumber = 40000;
        double doubleNumber = 5.5;
        float floatNumber = 200000;
        char charCharacter = 'J';
        byte byteByte = 1;
        boolean isItTrue = false;

        // Practice creating what you think would best describe and store the following values:
        // Your granny's age
        // The number of people in the world.
        // The weight of a cat in kg.
        // The initial of your last name
        // Whether or not the grass is green

        // Remember the 4 components each time, they NEED to be there
        // type + variable name + assignment + value

    }
}
