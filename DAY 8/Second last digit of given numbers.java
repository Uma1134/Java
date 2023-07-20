//Return second last digit of given numbers-mercer mettl
import java.io.*;
import java.util.*;
class UserMainCode
{
    public int secondLastDigitOf(int input1){
              if(input1<0)
                   input1=(-1)*input1;
              int c=0;
              int I=Integer.toString(input1).length();
              int r=0;
              if(I==1)
              {
                  return -1;
              }
              else
              {
                  while(input1>0)
                   {
                      r=input1%10;
                      c++;
                      input1/=10;
                      if(c==2)
                           break;
                    }
                    return r;
              }
}
