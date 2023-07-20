//Sum of last digits of two given numbers-mercer mettl
import java.io.*;
import java.util.*;
class UserMainCode
{
    public int addlastDigitOf(int input1,int input2){
              if(input1<0)
                   input1=(-1)*input1;
              if(input2<0)
                    input2=(-1)*input2;
              return (input1%10)+(input2%10);
    }
}
