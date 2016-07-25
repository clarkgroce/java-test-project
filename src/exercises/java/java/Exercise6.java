package exercises.java.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Exercise6 {

    public static void main(String[] args) {

        DataObject[] dataObjects = new DataObject[5];

        //Here we create the dataObject instance and initialize one of the 6 array objects in dataObjects, in this case
        //[0], with the value of "Friday" in the code member variable (in the DataObject class).
        DataObject dataObject = new DataObject();
        dataObject.code = "Friday";
        dataObjects[0] = dataObject;

        dataObject = new DataObject();
        dataObject.code = "Friday";
        dataObjects[1] = dataObject;

        dataObject = new DataObject();
        dataObject.code = "Saturday";
        dataObjects[2] = dataObject;

        dataObject = new DataObject();
        dataObject.code = "Saturday";
        dataObjects[3] = dataObject;

        dataObject = new DataObject();
        dataObject.code = "Saturday";
        dataObjects[4] = dataObject;

        HashMap map = new HashMap();

        //In this for loop we loop through the dataObjects array objects and increment the sum variable where the
        //code member variable starts with "F".
        for (int i = 0; i < dataObjects.length; i++) {
            //read sum for code
            Integer sumForCode = (Integer) map.get(dataObjects[i].code);

            //if no sum is in the map for that code yet start with sum of 0
            if (sumForCode == null) {
                sumForCode = new Integer(0);
            }
            //add count to sum
            sumForCode = sumForCode.intValue() + dataObjects[i].count;

            //store new sum in map
            map.put(dataObjects[i].code , sumForCode);

        }
        //iterate all keys (codes) in map
        for (Object code : map.keySet()) {
            System.out.println(code + "" + map.get(code));
        }

    }

}




