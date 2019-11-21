package challe;

public class ArrayShift {

    public static String[] insertShiftArray(String[] input){
        //String[] input = {"1","2","9","7","8","20"};
        //System.out.println("print array:"+ Arrays.toString(input));
        String newValue = "15";
        int length = input.length;
        int newLength = length+1;
        int midIndex = (int) Math.floor((length/2));

        String[] newArray = new String[length+1];
        System.out.println("Mid Index Value: "+midIndex);

        for (int j=0; j<input.length; j++){
            System.out.println("Input Array Value: "+ input[j]);
        }

        for (int i=0; i<newArray.length; i++){

            if (i==midIndex){
                newArray[i]=newValue;
                //System.out.println("New mid index value: "+newArray[i]);
                //newArray[i+1]=input[i+1];
            }
            else{
                if (i > midIndex){
                    newArray[i]=input[i-1];
                    System.out.println("newArray :"+newArray[i]);
                    System.out.println("OldArray :"+input[i-1]);
                }else{
                    newArray[i]=input[i];
                }
                //System.out.println("Array value:"+input[i] );
            }


        }

        for (int k=0; k<newArray.length; k++){
            System.out.println("output Array Value: "+ newArray[k]);
        }
        return newArray;

    }
}
