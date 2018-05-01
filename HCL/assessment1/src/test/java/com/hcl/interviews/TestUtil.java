package com.hcl.interviews;

public class TestUtil {

    public static String convertIntToString(int []outputArray){
        StringBuffer output = new StringBuffer();
        for(int i : outputArray){
            output.append(i);
            output.append(",");
        }
        if(output.length() > 0) {
            output.deleteCharAt(output.length() - 1);
        }
        return output.toString();
    }
}
