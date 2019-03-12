package com.stackroute;
 class NumbersWithOneAbsoluteDifference{
        // This Method checks if an integer n
        // is a Stepping Number



        // A brute force approach based function to find all
        // stepping numbers.
         int displaySteppingNumbers(int n,int m) {
             int p;
             boolean result;
             // Initalize prevDigit with -1
             int prevDigit = -1;

             // Iterate through all digits of n and compare
             // difference between value of previous and
             // current digits
             while (n > 0)
             {
                 // Get Current digit
                 int curDigit = n % 10;

                 // Single digit is consider as a
                 // Stepping Number
                 if (prevDigit != -1)
                 {
                     // Check if absolute difference between
                     // prev digit and current digit is 1
                     if (Math.abs(curDigit-prevDigit) != 1)
                         result= false;
                 }
                 n /= 10;
                 prevDigit = curDigit;
             }
            result= true;
             // Iterate through all the numbers from [N,M]
             // and check if it is a stepping number.
             for ( p = n; p <= m; p++)
                 if (result) {
                     System.out.print(p + " ");
                 }
             return p;
         }

    }
