package interview_coding;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZeroInTheEnd {
    public static void main(String[] args) {
        int[] elements = new int[]{0,9,0,8,7,0,5};
        int lastIndex = elements.length-1;
        for (int i = lastIndex;i >=0;i++){
            if(elements[i]==0){
                for(int j = i ; j<lastIndex;j++){
                    if(elements[j+1]==0 || j==lastIndex){
                        break;
                    }else {
                        int temp= elements[j+1];
                        elements[j+1]=elements[j];
                        elements[j]=temp;

                    }
                }
            }
        }
        System.out.println(Arrays.toString(elements));

    }
    
        }




