package Oops;
/*
Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.


nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
 */
class A {boolean nearHundred(int n) {
  if((n<=110 && n>=90) || (n>=190 && n<=210))
  return true; 
  else
  return false;
} }
/*
Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.


posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
*/
class B{
public boolean posNeg(int a, int b, boolean negative) {
    if(negative == false )
    {
      if( (a>0 && b>0) || (a<0 && b<0)  )
        return false;
    }
    if(negative==true )
     {
       if( (a>0 && b>0) || (a<0 && b>0) || (a>0 && b<0))
       return false;
     }
   
 return true;
  
}
}
/*
Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.


notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
*/
class C{

}