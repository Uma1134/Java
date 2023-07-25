//All Digits Count-mercer mettl
import java.io.*;
import java.util.*;
class UserMainCode{
  public int allDigitsCount(int input1){
        int c=0,r;
        while(input1>0){
            r=input1%10;
            c++;
            input1=input1/10;
        }
        return c;
  }
}
